package com.example;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        Assert.assertEquals("Hello from getMessage()!", HelloWorld.getMessage());
    }
}
