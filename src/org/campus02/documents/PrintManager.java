package org.campus02.documents;

import java.util.ArrayList;

public class PrintManager {

    private ArrayList<Document> documents;

    public PrintManager() {
        this.documents = new ArrayList<>();
    }

    public void add(Document doc) {
        documents.add(doc);
    }

    public void printAll() {
        for (Document d : documents) {
            d.printDocument();
        }
    }

}
