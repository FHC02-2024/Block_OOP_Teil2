package org.campus02.logisticmanager;

public class DemoApp {
    public static void main(String[] args) {

        Car c = new Car("Tesla", "white", 2500);
        Car f = new Car("Fiat", "red", 900);
        Shirt s = new Shirt("green", "Nike", 'S');

        LogisticManager lm = new LogisticManager();
        lm.add(c);
        lm.add(f);
        lm.add(s);

        lm.moveAll("Graz");

        lm.moveAll("Wien");

    }
}
