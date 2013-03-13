package org.muz;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberParserTest {

    RomanNumberParser parser = new RomanNumberParser();

    @Test
    public void testParse() throws Exception {
        Assert.assertEquals(1, parser.parse("I"));
        Assert.assertEquals(2, parser.parse("II"));
        Assert.assertEquals(3, parser.parse("III"));
        Assert.assertEquals(4, parser.parse("IV"));
        Assert.assertEquals(5, parser.parse("V"));
        Assert.assertEquals(6, parser.parse("VI"));
        Assert.assertEquals(7, parser.parse("VII"));
        Assert.assertEquals(8, parser.parse("VIII"));
        Assert.assertEquals(9, parser.parse("IX"));
        Assert.assertEquals(10, parser.parse("X"));
        Assert.assertEquals(14, parser.parse("XIV"));
        Assert.assertEquals(15, parser.parse("XV"));
        Assert.assertEquals(19, parser.parse("XIX"));
        Assert.assertEquals(20, parser.parse("XX"));
        Assert.assertEquals(60, parser.parse("LX"));
        Assert.assertEquals(49, parser.parse("XLIX"));
        Assert.assertEquals(99, parser.parse("XCIX"));
        Assert.assertEquals(1900, parser.parse("MCM"));
        Assert.assertEquals(1976, parser.parse("MCMLXXVI"));
        Assert.assertEquals(2013, parser.parse("MMXIII"));
        Assert.assertEquals(1990, parser.parse("MCMXC"));
    }
}
