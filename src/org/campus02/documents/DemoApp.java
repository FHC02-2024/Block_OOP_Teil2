package org.campus02.documents;

import java.util.ArrayList;

public class DemoApp {
    public static void main(String[] args) {

        CsvDocument d = new CsvDocument("csvdoc.csv", new ArrayList<>());
        d.addLine("Spalte1;Spalte2;Spalte3");
        d.addLine("Zeile2a;Zeile2c;Zeile2c");

        ImageDocument id = new ImageDocument("picture.png", 100, 100, "green");

        TextDocument text = new TextDocument("text.txt", "Lorem Ipsum Text");

        PrintManager pm = new PrintManager();
        pm.add(d);
        pm.add(id);
        pm.add(text);

        pm.printAll();
    }
}
