package com.example.tut.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concurrency {
    public static void main(String[] args) {
        var Thread = new ThreadExample();
        var Thread1 = new ThreadExample();
        Thread.run();
        Thread1.run();


        // ExectorService manage thread
      ATM atm = new ATM();
      Bank bank = new Bank(100);

         ExecutorService service = Executors.newFixedThreadPool(2);

//         service.submit(()-> System.out.println("Hello word"));
//         service.submit(thread1::run);
//         service.submit(thread2::run);
         service.submit(()-> atm.debit(bank,100));
         service.submit(()-> atm.debit(bank,100));
    }
}
