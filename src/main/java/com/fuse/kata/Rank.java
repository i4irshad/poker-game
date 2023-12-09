package com.fuse.kata;

public enum Rank {

    TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE('9'), TEN('1'), JACK('j'), QUEEN('q'), KING('k'), ACE('a');

    char charValue;

    Rank(char charValue) {
        this.charValue = charValue;
    }


    public static Rank valueForAbbreviation(char shorthand) {
        for (Rank rank : values()) {
            if (rank.getCharValue() == shorthand) return rank;
        }
        return null;
    }

    public char abbreviation() {
        return this.charValue;
    }

    public char getCharValue() {
        return charValue;
    }
}
