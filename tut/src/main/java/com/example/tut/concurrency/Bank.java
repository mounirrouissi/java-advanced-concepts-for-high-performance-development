package com.example.tut.concurrency;

import java.util.Objects;

public final class Bank {
    private  int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
public void setBalance(int i) {
        balance = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Bank) obj;
        return this.balance == that.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        return "Bank[" +
                "balance=" + balance + ']';
    }


}
