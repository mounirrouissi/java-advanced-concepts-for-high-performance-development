package com.example.tut.concurrency;

public class ThreadExample extends Thread{
    @Override
    public void run() {    
        super.run();
        System.out.println("Hello"+this.getName());
    }
}
