package org.campus02.customer;

public class DemoApp {

    public static void main(String[] args) {
        
        Customer customer = new Customer(1234, "Susi", "Sorglos");
        customer.addAddress(new Address("Körblerstraße 1", "Graz", "8010", "Austria"));

        System.out.println("customer.toString() = " + customer.toString());

        customer.print();
        System.out.println("---");
        customer.print();
    }
}
