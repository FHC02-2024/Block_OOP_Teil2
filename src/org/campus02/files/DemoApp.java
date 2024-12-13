package org.campus02.files;

public class DemoApp {

    public static void main(String[] args) {

        File f1 = new File("test1", "txt", 1000);
        File f2 = new File("test2", "txt", 2000);
        File f3 = new File("test3", "txt", 3000);
        File f4 = new File("test4", "txt", 4000);
        File f5 = new File("test5", "txt", 123);

        Folder root = new Folder("root");
        root.add(f5);
        Folder sub1 = new Folder("sub1");
        Folder sub2 = new Folder("sub2");

        root.add(sub1);
        root.add(sub2);
        sub1.add(f1);
        sub1.add(f2);
        sub2.add(f3);
        sub2.add(f4);

        System.out.println("sub1.getSize() = " + sub1.getSize());
        System.out.println("sub2.getSize() = " + sub2.getSize());
        System.out.println("root.getSize() = " + root.getSize());

        root.print("");
    }
}
