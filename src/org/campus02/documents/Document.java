package org.campus02.documents;

public class Document {
    protected String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public void printDocument() {
        System.out.println("This is a document: "  + fileName);
    }
}