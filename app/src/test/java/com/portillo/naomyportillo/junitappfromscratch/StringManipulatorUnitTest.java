package com.portillo.naomyportillo.junitappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorUnitTest {

    private StringManipulator stringManipulator;

    @Before
    public void setUp() {
        stringManipulator = StringManipulator.getInstance();
    }

    @Test
    public void check_ifLess_than10() {
        String lessThan10 = "ham";
        String moreThan10 = "ham and cheese omelette";
        Assert.assertTrue(stringManipulator.isLessThan10(lessThan10));
    }

    @Test
    public void check_ifLess_than10_isNotNull() {
        stringManipulator.isLessThan10(null);
        // Assert.assertNotNull(stringManipulator.isLessThan10(null));
    }

    @Test
    public void check_ifOddLength() {
        String oddLength = "ham";
        String evenLength = "cake";
        Assert.assertTrue(stringManipulator.isOddLength(oddLength));
    }

    @Test
    public void check_ifOddLength_notNull() {
       stringManipulator.isOddLength(null);
    }

    @Test
    public void check_zipperWordsString() {
       String shortS = "ice";
       String longS = "icecream";
       String zipper = "iicceecream";

       Assert.assertEquals(zipper, stringManipulator.zipperWords(shortS, longS));
    }

    @Test
    public void check_deconstructedWordsString() {
        String word = "america";
        String deconstruct = "mrc aeia";

        Assert.assertEquals(deconstruct, stringManipulator.deconstructedWord(word));
    }

    @Test
    public void check_wordSum() {
        String first = "ham";
        String second = "cheese";
        int sum = 9;

        Assert.assertEquals(sum, stringManipulator.wordSum(first, second));
    }

    @Test
    public void check_longestWord() {
        String[] arr = {"cake", "cookie", "cheesecake"};
        String longest = "cheesecake";

        Assert.assertEquals(longest, stringManipulator.longestWord(arr));
    }


    @After
    public void tearDown() {
        stringManipulator = null;
    }
}
