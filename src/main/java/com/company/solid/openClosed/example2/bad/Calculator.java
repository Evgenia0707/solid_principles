package com.company.solid.openClosed.example2.bad;

public class Calculator {
    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;

        if (operation.getType().equals(OperationType.ADDITION)) {
            System.out.println(num1 + num2);
        }

        if (operation.getType().equals(OperationType.SUBTRACTION)) {
            System.out.println(num1 - num2);
        }

        if (operation.getType().equals(OperationType.MULTIPLICATION)) {
            System.out.println(num1 * num2);
        }

        if (operation.getType().equals(OperationType.DIVISION)) {
            System.out.println(num1 / num2);
        }
// What happens if i want to add another operation later? //  new in enum + new if stm

//        if (operation.getType().equals(OperationType.MODULUS)) {
//            System.out.println(num1 / num2);
    }

}
