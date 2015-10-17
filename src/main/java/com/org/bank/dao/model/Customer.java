package com.org.bank.dao.model;

/**
 * Created by SMALA on 10/15/2015.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Address address;
    private String mobile;
    private String landLine;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Address address, String mobile, String landLine) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobile = mobile;
        this.landLine = landLine;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", mobile='" + mobile + '\'' +
                ", landLine='" + landLine + '\'' +
                '}';
    }
}
