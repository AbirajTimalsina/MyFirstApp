package com.myfirstapp;

public class arithmetic {

   private int first;
   private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int add()
    {
        return first+second;
    }

    public int sub()
    {
        return first-second;
    }

    public int mul()
    {
        return first*second;
    }

    public int div()
    {
        return first/second;
    }
}
