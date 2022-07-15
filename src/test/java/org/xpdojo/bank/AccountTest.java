package org.xpdojo.bank;



import org.junit.Test;

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




}
