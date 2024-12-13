package org.campus02.documents;

public abstract class Document {
    protected String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public void doSomething(){
        printDocument();
    }

    public abstract void printDocument();
}
