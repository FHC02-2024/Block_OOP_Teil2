package org.campus02.logisticmanager;

import java.util.ArrayList;

public class LogisticManager {

    private ArrayList<Moveable> moveables;

    public LogisticManager() {
        moveables = new ArrayList<>();
    }

    public void add(Moveable m) {
        moveables.add(m);
    }

    public void moveAll(String destination) {
        for (Moveable m : moveables) {
            m.move(destination);
        }
    }
}
