package com.enko.books.Jwt;

public class JwtResponse {

    private String userName;
    public JwtResponse(String username) {
        this.userName = username;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}