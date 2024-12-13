package org.campus02.documents;

public class WordDocument extends Document {
    public WordDocument(String fileName) {
        super(fileName);
    }

    public void printDocument() {
        System.out.println("Worddocument");
    }
}
