package fi.lahti.hw;

import java.math.BigDecimal;
import java.util.Hashtable;

public class ProductPriceList {
    public static final Hashtable<ProductList, BigDecimal> productPriceList = new Hashtable<>();


    public void addProducts() {
        productPriceList.put(ProductList.MAYONNAISE, new BigDecimal(40));
        productPriceList.put(ProductList.Egg, new BigDecimal(5));
        productPriceList.put(ProductList.CUCUMBER, new BigDecimal(10));
    }


}
