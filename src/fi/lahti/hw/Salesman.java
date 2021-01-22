package fi.lahti.hw;

import java.math.BigDecimal;

public class Salesman extends Person{
    public Salesman(BigDecimal cash, String name) {
        super(cash, name);
    }

    @Override
    public void withdrawal(BigDecimal amount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deposit(BigDecimal amount) {
        setCash(getCash().add(amount));
    }
}
