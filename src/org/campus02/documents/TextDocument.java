package org.campus02.documents;

public class TextDocument extends Document {
    private String content;
    public TextDocument(String fileName, String content) {
        super(fileName);

        this.content = content;
    }

    @Override
    public void printDocument() {
        System.out.println("content = " + content);
        System.out.println("fileName = " + fileName);
    }
}
