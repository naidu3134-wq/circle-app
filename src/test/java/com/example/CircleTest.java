package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testCalculateArea() {
        Circle circle = new Circle();
        assertEquals(78.53981633974483, circle.calculateArea(5.0), 0.0001);
    }

    @Test
    void testZeroRadius() {
        Circle circle = new Circle();
        assertEquals(0.0, circle.calculateArea(0.0), 0.0001);
    }

    @Test
    void testNegativeRadius() {
        Circle circle = new Circle();
        assertThrows(IllegalArgumentException.class, () -> {
            circle.calculateArea(-5.0);
        });
    }
}