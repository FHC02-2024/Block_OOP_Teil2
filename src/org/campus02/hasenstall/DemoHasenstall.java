package org.campus02.hasenstall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoHasenstall {

    public static void main(String[] args) {

        OsterHase osterHase = new OsterHase("Felix");
        WeihnachtsHase weihnachtsHase = new WeihnachtsHase("Santa");

        osterHase.verteilen();
        weihnachtsHase.verteilen();

        osterHase.fressen();
        osterHase.schlafen();
        weihnachtsHase.schlafen();

        ArrayList<Hase> hasenstall = new ArrayList<>();
        hasenstall.add(osterHase);
        hasenstall.add(weihnachtsHase);

        System.out.println("--- liste ---");
        for (Hase h : hasenstall) {
            h.verteilen();
            h.fressen();
        }

        System.out.println("---- casting ----");

        //upcasting
        Hase h = weihnachtsHase;
        h.fressen();
        h.verteilen();

        // down-casting
        WeihnachtsHase wh = (WeihnachtsHase) h;
        wh.verteilen();

        //OsterHase oh = (OsterHase) h;
        //h.verteilen();



    }
}
