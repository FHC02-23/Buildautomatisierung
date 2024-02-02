package org.campus02.zettel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotenverteilungTest {

    Notenverteilung nv;

    @BeforeEach
    void setUp() {
        nv = new Notenverteilung();
    }

    @Test
    @DisplayName("Füge einen Studenten hinzu")
    void addStudent() {
        boolean result = nv.addStudent("Max");
        //Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }
}