package org.campus02.files;

import java.util.ArrayList;

public class Folder extends FSEntry {

    private ArrayList<FSEntry> entries;

    public Folder(String name) {
        super(name);
        entries = new ArrayList<>();
    }

    public void add(FSEntry entry) {
        entries.add(entry);
    }

    @Override
    public int getSize() {

        int size = 0;

        for (FSEntry entry : entries) {
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+" + name);

        for (FSEntry entry : entries) {
            entry.print(indent + "  ");
        }
    }
}
