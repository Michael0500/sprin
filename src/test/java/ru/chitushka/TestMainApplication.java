package ru.chitushka;

import org.junit.Assert;
import org.junit.Test;

public class TestMainApplication {
    @Test
    public void testIsNull() {
        Assert.assertNull(null);
    }

    @Test
    public void testErrorAssert() {
        Assert.assertEquals(1, 2);
    }
}
