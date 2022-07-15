package org.xpdojo.bank;



import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.*;


public class AccountTest {

    @Test
    public void accountInitialize() {
        Account acc = new Account();
        acc.initialize(0);
        assertThat(acc.getBalance(), is(0));
    }




}
