package org.campus02.hasenstall;

public class OsterHase extends Hase{
    public OsterHase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + " bemalt und versteckt Ostereier im Garten");
    }
}
