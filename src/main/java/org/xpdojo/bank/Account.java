package org.xpdojo.bank;

public class Account {

     int balance = 0;

    int getBalance() {
       return balance;
    }


    public void deposit(int amount) {
        balance += amount;

    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public boolean transfer(Account acc2, int amount) {
        boolean result = this.withdraw(amount);
        if (!result) {
            return false;
        }
        acc2.deposit(amount);
        return true;
    }
}
