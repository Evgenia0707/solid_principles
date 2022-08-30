package com.company.solid.dependencyInversion.example.good;

public class TextReader implements Reader{
    @Override
    public String getUserName() {
        return "mikesmith";
    }
}
