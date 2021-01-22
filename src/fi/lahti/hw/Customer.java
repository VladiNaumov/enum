package fi.lahti.hw;

import java.math.BigDecimal;

public class Customer extends Person {

    public Customer(BigDecimal cash, String name) {
        super(cash, name);
    }

    @Override
    public void withdrawal(BigDecimal amount) {
        setCash(getCash().subtract(amount));
    }

    @Override
    public void deposit(BigDecimal amount) {
        throw new UnsupportedOperationException();
    }

}
