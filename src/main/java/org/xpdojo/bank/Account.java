package org.xpdojo.bank;

public class Account {

     int balance = 0;

    int getBalance() {
       return balance;
    }


    public void deposit(int amount) {
        balance += amount;

    }
}
