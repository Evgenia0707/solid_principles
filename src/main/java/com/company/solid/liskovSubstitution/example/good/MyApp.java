package com.company.solid.liskovSubstitution.example.good;


import java.util.Arrays;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

        Square square = new Square();
        square.setSide(4);

//        List<Rectangle> rectangles = Arrays.asList(rectangle, square);//can not use

//        changeHeightAndWidth(rectangles);

    }

    public static void changeHeightAndWidth(List<Rectangle> rectangles) {

        for (Rectangle rectangle : rectangles) {
            rectangle.setHeight(5);   //Rectangle H ->5  Square H, W -> 5
            rectangle.setWidth(6);    //Rectangle H ->6   Square H, W -> 5
            System.out.println(rectangle.getArea() == 30);//Rectangle Area -> 30
        }                                                 //Square Area -> 36

    }


}