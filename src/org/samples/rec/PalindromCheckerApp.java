package org.samples.rec;

import java.util.ArrayList;

public class PalindromCheckerApp {

    public static void main(String[] args) {
        ArrayList<Character> elements = new ArrayList<>();
        elements.add('a');
        elements.add('b');
        elements.add('c');
        elements.add('d');
        elements.add('c');
        elements.add('b');
        elements.add('a');

        System.out.println("elements = " + elements);

        System.out.println("checkPalindrom(elements) = " + checkPalindrom(elements));

        System.out.println("elements = " + elements);
    }

    public static boolean checkPalindrom(ArrayList<Character> chars) {

        // Abbruchbedingungen finden
        if (chars.size() <= 1)
            return true;
        
        if (chars.get(0) != chars.get(chars.size() - 1))
            return false; // erste und letzte zeichen unterschiedlich
        
        chars.remove(0);
        chars.remove(chars.size() - 1);
        
        return checkPalindrom(chars);
    }

}
