package com.fuse.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void valueForStringReturnsExpectedEnumValue() {
        assertEquals(Suit.CLUB, Suit.valueForAbbreviation("C"));
    }

}