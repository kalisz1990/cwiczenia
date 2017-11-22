package com.company;

import java.util.Scanner;

public class Bike {

    int speed;
    boolean brake;

    //zrobilem rower, tylko nie jestem pewny czy dobrze to rozumiem.
    //Stworzylem klase bike gdzie umiesclem metody jak widzisz.
    //Czy powinienem zrobić osobne klasy dla kazdego z obiektow? osobno dla kola z przodu i osobna dla kola z tylu, i wtedy zrobić dziedziczenie do klasy rower?
    //class FrontWheel extends Bike {}
    // i tutaj wsadzic metody odnosnie kola z przodu, i analogicznie do kola z tylu?


    public void bike(int speed){
        this.speed = speed;
        System.out.println("rower jedzie "+speed+" km/h");
    }

    boolean wheelSpins() {
        if (speed > 0)
            return true;
        else
            System.out.print("rower stoi ");
            return false;
    }

    void frontWheel() {
       if(wheelSpins())
           System.out.println("kolo przednie sie kreci");
        else
           System.out.println("i kolo przednie sie nie kreci");
    }

    void backWheel() {
        if (wheelSpins())
            System.out.println("kolo tylne sie kreci");
        else
            System.out.println("i kolo tylne sie nie kreci");
    }

    void braking(boolean brake) {

        this.brake = brake;
        if (brake) {
            speed = 0;
            System.out.println("rower hamuje");
        }
    }

    public static void main (String [] args)
    {
    Bike unibike = new Bike();

    unibike.bike(45);
    unibike.wheelSpins();
    unibike.frontWheel();
    unibike.backWheel();
    unibike.braking(true);
    unibike.frontWheel();
    unibike.backWheel();
    unibike.wheelSpins();
    }
}
