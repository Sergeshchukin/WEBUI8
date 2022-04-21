package com.geekbrains.lesson5.hw4;

import com.geekbrains.hw4.TriangleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void successCalculationTest() throws Exception {
        Assertions.assertEquals(TriangleArea.calculateArea(1, 2, 2), 2);
    }
}
