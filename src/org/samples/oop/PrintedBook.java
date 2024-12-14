package org.samples.oop;

public class PrintedBook extends Book{
    private int countPages;

    public PrintedBook(String title, double price, String author, String category, int countPages) {
        super(title, price, author, category);
        this.countPages = countPages;
    }

    @Override
    public void printPresentationPage() {
        System.out.println("Titel: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Buchkategorie: " + category);
        System.out.println("Rating: " + calculateRating());
        System.out.println("Preis: " + price);
        System.out.println("Seiten: " + countPages);
    }
}
