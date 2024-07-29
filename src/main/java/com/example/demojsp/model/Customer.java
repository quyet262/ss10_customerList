package com.example.demojsp.model;

import java.util.Date;

public class Customer {
    private String name;
    private String birthday;
    private String address;
    private String imgURL;
    public Customer() {}
    public Customer(String name, String birthday, String address, String imgURL) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", imgURL='" + imgURL + '\'' +
                '}';
    }
}
