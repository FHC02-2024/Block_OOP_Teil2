package org.campus02.files;

public abstract class FSEntry {
    protected String name;

    public FSEntry(String name) {
        this.name = name;
    }

    public abstract int getSize();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(String indent) {
        System.out.println(name);
    }
}
