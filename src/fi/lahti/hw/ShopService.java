package fi.lahti.hw;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShopService {
    public void buyProduct(Customer customer, Salesman salesman) {
        ArrayList<Product> customerProducts = customer.getProducts();
        ArrayList<Product> salesmanProducts = salesman.getProducts();

        for (Product currentSalesmanProduct : salesmanProducts ) {
            for (Product currentCustomerProduct : customerProducts) {
                if (currentCustomerProduct.getName().equals(currentSalesmanProduct.getName())) {
                    if (currentSalesmanProduct.getCount() < currentCustomerProduct.getCount()) {
                        System.out.printf("The salesman %s doesn't have %d units of the product %s \n", salesman.getName(),
                                currentCustomerProduct.getCount(), currentCustomerProduct.getName());
                        return;
                    }

                    BigDecimal currentPrice =
                            currentSalesmanProduct.getPrice().multiply(new BigDecimal(currentCustomerProduct.getCount()));

                    if (customer.getCash().compareTo(currentPrice) < 0) {
                        System.out.printf("The customer %s doesn't have %f Euros to buy the %d amounts of the product %s\n",
                                customer.getName(), currentPrice, currentCustomerProduct.getCount(), currentCustomerProduct.getName());
                        return;
                    }

                    currentSalesmanProduct.setCount(currentSalesmanProduct.getCount() - currentCustomerProduct.getCount());

                    BigDecimal salesmanCash = salesman.getCash();
                    BigDecimal customerCash = customer.getCash();

                    salesman.setCash(salesmanCash.add(currentPrice));
                    customer.setCash(customerCash.subtract(currentPrice));
                }
            }
        }
    }
}
