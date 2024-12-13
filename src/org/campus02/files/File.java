package org.campus02.files;

public class File extends FSEntry {

    private int size;
    private String extension;

    public File(String name, String extension, int size) {
        super(name);
        this.size = size;
        this.extension = extension;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + "." + extension + " > Size: " + size);
    }
}
