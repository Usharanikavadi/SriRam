package com.company;

interface pad{
    void eat();
}
 class pract implements pad {
    public void eat() {
        System.out.println("Hello Rani...");
    }

    public static void main(String[] args) {
        pract p1 = new pract();
            p1.eat();
    }
    }