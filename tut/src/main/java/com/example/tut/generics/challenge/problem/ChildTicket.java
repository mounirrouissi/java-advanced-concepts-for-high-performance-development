package com.example.tut.generics.challenge.problem;

public class ChildTicket extends Ticket {


    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString() {
        return "Child ticket";
    }

}
