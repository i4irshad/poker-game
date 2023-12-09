package com.fuse.kata;

public enum Suit {

    SPADE, HEART, CLUB, DIAMOND;

    public static Suit valueForAbbreviation(String string) {
        for (Suit suit: values()) {
            if (suit.name().startsWith(string)) {
                return suit;
            }
        }
        return null;
    }

    public String abbreviated() {
        return name().substring(0, 1);
    }


}
