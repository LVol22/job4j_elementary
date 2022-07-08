package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 16.2;
        double ac = 23;
        double bc = 49.7;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}