package com.company.solid.openClosed.example2.good;

public class Division implements Operation {

    public void calculate(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}