package com.example.tut.concurrency;

public class ATM {
    public synchronized void debit(Bank account , int amount){
        int balance = account.getBalance();

        if (balance - amount <0 ){
            System.out.println("transaction denied");
        }else{
            System.out.println("transaction accepted");
            account.setBalance(balance-amount);
            System.out.println(amount + "withdrown");

        }
        System.out.println("currenct balance: " + account.getBalance());
    }
}
