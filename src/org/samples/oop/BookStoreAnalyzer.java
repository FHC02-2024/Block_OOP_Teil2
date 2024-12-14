package org.samples.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class BookStoreAnalyzer {
    private ArrayList<Book> books; // Set

    public BookStoreAnalyzer() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        if (!books.contains(b)) {
            books.add(b);
        }
    }

    public HashMap<String, Integer> getCountBooksInCategory() {
        HashMap<String, Integer> result = new HashMap<>();

        for (Book b : books) {
            if (result.containsKey(b.getCategory())) {
                // es gibt schon einen Eintrag

                int currentCounter = result.get(b.getCategory());
                currentCounter++;
                result.put(b.getCategory(), currentCounter);

                //result.put(b.getCategory(), result.get(b.getCategory()) + 1);
            }
            else {
                result.put(b.getCategory(), 1);
            }

        }


        return result;
    }
}
