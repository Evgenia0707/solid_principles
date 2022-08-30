package com.company.solid.dependencyInversion.example.good;

public class JSONReader implements Reader {

    /*
            Example JSON:
            {
            "username" : "mikesmith
                }
    */

    @Override
    public String getUserName() {
        return "{\"username\" : \"mikesmith\"}";
    }
}
