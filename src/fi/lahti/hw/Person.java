package fi.lahti.hw;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Person {
    private BigDecimal cash;
    private String name;
    private final ArrayList<Product> products;

    public Person(BigDecimal cash, String name) {
        if (isCashValid(cash)) {
            products = new ArrayList<>();
            return;
        }
        this.cash = cash;
        this.name = name;

        products = new ArrayList<>();
    }

    public abstract void withdrawal(BigDecimal amount);

    public abstract void deposit(BigDecimal amount);

    public void addProducts(Product product) {
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        if (isCashValid(cash)) {
            return;
        }
        this.cash = cash;
    }

    private boolean isCashValid(BigDecimal cash) {
        return cash.equals(BigDecimal.ZERO) || cash.compareTo(BigDecimal.ZERO) < 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
