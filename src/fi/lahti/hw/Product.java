package fi.lahti.hw;

import java.math.BigDecimal;

public class Product {
    private int count;
    private final BigDecimal price;
    private final ProductList name;

    public Product(int count, BigDecimal price, ProductList name) {
        this.count = count;
        this.price = price;
        this.name = name;
    }

    public void setCount(int count) {
        if(count < 0) {
            System.out.println("Количество товара не может быть меньше нуля");
        }

        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductList getName() {
        return name;
    }
}
