package com.company.solid.interfaceSegregation.example.good;

public class Chicken implements CanEat, CasnWalk{

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }
}
