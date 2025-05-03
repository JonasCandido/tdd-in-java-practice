 package com.jonas.money.tddmoney;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple Franc.
 */

public class FrancTest {

    /**
     * Rigorous Test :-)
     */

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}
