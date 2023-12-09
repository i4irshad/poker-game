package com.fuse.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {

    @Test
    void valueForAbbreviationReturnsExpectedValue() {
        assertEquals(Rank.THREE, Rank.valueForAbbreviation('3'));
    }

}