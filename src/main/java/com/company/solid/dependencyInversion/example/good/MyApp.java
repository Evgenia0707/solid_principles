package com.company.solid.dependencyInversion.example.good;

import javax.sql.rowset.spi.XmlReader;

public class MyApp {
//    public static void main(String[] args) {
//
//        XMLReader xmlReader = new XMLReader();
//
//        UserReader userReader = new UserReader(xmlReader);
//
//        userReader.getUsername();


    public static void read(Reader reader) {
        UserReader userReader = new UserReader(reader);

        userReader.getUsername();
    }
}
