package fi.lahti.hw;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ShopService shopService = new ShopService();

        Salesman salesman = new Salesman(new BigDecimal(500), "Виталий");

        Customer customer = new Customer(new BigDecimal(200), "Илья");

        salesman.addProducts(new Product(20, ProductPriceList.productPriceList.get(ProductList.Egg), ProductList.Egg));
        salesman.addProducts(new Product(50, ProductPriceList.productPriceList.get(ProductList.MAYONNAISE), ProductList.MAYONNAISE));
        salesman.addProducts(new Product(16, ProductPriceList.productPriceList.get(ProductList.CUCUMBER), ProductList.CUCUMBER));

        customer.addProducts(new Product(5, ProductPriceList.productPriceList.get(ProductList.Egg), ProductList.Egg));
        customer.addProducts(new Product(1, ProductPriceList.productPriceList.get(ProductList.MAYONNAISE), ProductList.MAYONNAISE));

        Customer customer2 = new Customer(new BigDecimal(100), "Арина");
        customer2.addProducts(new Product(21, ProductPriceList.productPriceList.get(ProductList.Egg), ProductList.Egg));

//        System.out.println(ProductList.Egg);
          System.out.println(salesman.getProducts().get(0).getPrice());
          System.out.println(salesman.getProducts().get(1).getPrice());


    }
}

