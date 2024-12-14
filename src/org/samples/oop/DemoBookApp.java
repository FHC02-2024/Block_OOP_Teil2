package org.samples.oop;

public class DemoBookApp {
    public static void main(String[] args) {
        PrintedBook pb = new PrintedBook("1984", 8.9, "Georg Orwell", "Roman", 258);
        pb.addRating(new Rating(5, "super"));
        pb.addRating(new Rating(4, "gut"));

        DigitalBook db = new DigitalBook("1984", 8.9, "Georg Orwell", "Roman","file.epub", 1234);

        PrintedBook bp1 = new PrintedBook("Der kleine Frosch", 12, "nobody", "Kinderbuch", 12);

        pb.printPresentationPage();
        db.printPresentationPage();
        
        BookStoreAnalyzer bsa = new BookStoreAnalyzer();
        bsa.addBook(pb);
        bsa.addBook(db); // STRG+D
        bsa.addBook(bp1);


        System.out.println("bsa.getCountBooksInCategory() = " + bsa.getCountBooksInCategory());
    }
}
