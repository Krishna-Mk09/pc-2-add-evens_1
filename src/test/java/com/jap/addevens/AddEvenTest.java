package com.jap.addevens;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddEvenTest {
    AddEven addEven = null;

    @Before
    public void setUp() {
        addEven = new AddEven();
    }

    @After
    public void tearDown() {
        addEven = null;
    }

    @Test
    public void givenAnIntegerAddEvenNumbersTillTheIntegerReturnSumOfEvensSuccess() {
        assertEquals(20, addEven.addEvens(9));
        assertEquals(110, addEven.addEvens(20));
        assertEquals(650, addEven.addEvens(50));
    }

    @Test
    public void givenAnIntegerAddEvenNumbersTillTheIntegerReturnSumOfEvensFailure() {
        assertEquals(0, addEven.addEvens(-9));
        assertEquals(0, addEven.addEvens(-20));
        assertEquals(0, addEven.addEvens(0));
    }
}
