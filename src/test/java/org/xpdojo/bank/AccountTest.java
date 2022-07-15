package org.xpdojo.bank;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class AccountTest {


    @Test
    public void accountInitialize() {
        Account acc = new Account();
        assertThat(acc.getBalance(), is(0));
    }
    @Test
    public void depositMoney() {
        Account acc = new Account();
        acc.deposit(100);
        assertThat(acc.getBalance(), is(100));
    }

    @Test
    public void withdrawMoney() {
        Account acc = new Account();
        acc.deposit(100);
        boolean result = acc.withdraw(30);
        assertThat(acc.getBalance(), is(70));
        assertThat(result, is(true));
    }

    @Test
    public void withdrawMoreThanBalance() {
        Account acc = new Account();
        acc.deposit(100);
        boolean result = acc.withdraw(300);
        assertThat(acc.getBalance(), is(100));
        assertThat(result, is(false));
    }

    @Test
    public void transferMoney() {
        Account acc1 = new Account();
        Account acc2 = new Account();
        acc1.deposit(100);
        acc2.deposit(200);
        boolean result = acc1.transfer(acc2, 30);
        assertThat(result, is(true));
        assertThat(acc1.getBalance(), is(70));
        assertThat(acc2.getBalance(), is(230));

    }

}
