package org.campus02.logisticmanager;

public class Shirt implements Moveable{
    private String colour;
    private String brand;
    private char size;

    public Shirt(String colour, String brand, char size) {
        this.colour = colour;
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public void move(String destination) {
        System.out.println("Shirt " + brand + " will be moved to " + destination);
    }
}
