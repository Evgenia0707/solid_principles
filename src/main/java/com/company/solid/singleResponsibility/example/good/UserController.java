package com.company.solid.singleResponsibility.example.good;

public class UserController {//capture request from people

    public static void getRequest() {
        //Get the request
        //Send this request to validation and security part

    }

    public static String createResponse() {
        return "Response";  //for example "User is created"
    }

    public static void sendResponse() {
        //send user a response;
    }
}