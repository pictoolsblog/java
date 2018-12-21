package com.pictools;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void repeatTest(){
        Assert.assertEquals("Hello".repeat(0), "");
        Assert.assertEquals("Hello".repeat(1), "Hello");
        Assert.assertEquals("Hello".repeat(3), "HelloHelloHello");
    }

    @Test
    public void linesTest(){
        Assert.assertEquals("Hi\nhow\nare\nyou?".lines().count(), 4);
        Assert.assertEquals("Hi\rhow\rare\ryou?".lines().count(), 4);
        Assert.assertEquals("Hi\r\nhow\r\nare\r\nyou?".lines().count(), 4);
        Assert.assertEquals("\n".lines().count(), 1);
        Assert.assertEquals("\n\n".lines().count(), 2);
    }

    @Test
    public void isBlankTest(){
        Assert.assertTrue("".isBlank());
        Assert.assertTrue("         ".isBlank());
    }

    @Test
    public void stripLeadingTest(){
        Assert.assertEquals(" Hello".stripLeading(), "Hello");
        Assert.assertEquals("         ".stripLeading(), "");
    }

    @Test
    public void stripTrailingTest(){
        Assert.assertEquals("Hello ".stripTrailing(), "Hello");
        Assert.assertEquals("         ".stripTrailing(), "");
    }

    @Test
    public void stripTest(){
        Assert.assertEquals(" Hello".strip(), "Hello");
        Assert.assertEquals("Hello ".strip(), "Hello");
        Assert.assertEquals(" Hello ".strip(), "Hello");
        Assert.assertEquals("         ".strip(), "");
    }
}
