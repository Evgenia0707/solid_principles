package com.company.solid.interfaceSegregation.example.good;

public class Eagle implements CanEat, CasnWalk, CanFly{

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void fly() {
        System.out.println("Flying.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }
}
