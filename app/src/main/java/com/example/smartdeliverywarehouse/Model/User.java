package com.example.smartdeliverywarehouse.Model;

public class User {

    private String phoneNumber;
    private String Name;
    private String Password;

    public User(){

    }
    public User(String phoneNumber, String name, String password) {
        this.phoneNumber = phoneNumber;
        Name = name;
        Password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
