package org.samples.oop;

public class DigitalBook extends Book {
    private String fileName;
    private int fileSize;

    public DigitalBook(String title, double price, String author, String category, String fileName, int fileSize) {
        super(title, price, author, category);
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public void printPresentationPage() {
        System.out.println("Titel: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Buchkategorie: " + category);
        System.out.println("Rating: " + calculateRating());
        System.out.println("Datei: " + fileName + ", " + fileSize + " KB");
    }
}
