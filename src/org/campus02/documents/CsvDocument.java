package org.campus02.documents;

import java.util.ArrayList;

public class CsvDocument extends Document{
    private ArrayList<String> lines;

    public CsvDocument(String fileName, ArrayList<String> lines) {
        super(fileName);
        this.lines = lines;
    }

    @Override
    public void printDocument() {
        System.out.println("fileName = " + fileName);

        for (String line : lines) {
            System.out.println("line = " + line);
        }
    }

    public void addLine(String line) {
        lines.add(line);
    }
}
