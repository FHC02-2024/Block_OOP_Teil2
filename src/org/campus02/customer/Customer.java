package org.campus02.customer;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses /*= new ArrayList<>();*/;

    public Customer(int customerNumber, String firstname, String lastname) {
        super(firstname, lastname);
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
        //this.setFirstname(firstname);
        //this.setLastname(lastname);
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                '}';
    }

    @Override
    public void print() {
        super.print(); // Super greift immer auf die Basisklasse zu
        System.out.println("customerNumber = " + customerNumber);
        System.out.println("addresses = " + addresses);
    }
}
