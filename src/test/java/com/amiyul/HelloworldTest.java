package com.amiyul;

import org.junit.Assert;
import org.junit.Test;

public class HelloworldTest {
    @Test
    public void sayHello_shouldReturnTheCorrectMessage() {
        Assert.assertEquals("Hello, World!", new Helloworld().sayHello());
    }
}