package org.netology;

import org.junit.Test;



public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemainThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int  expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.bonus(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }


}