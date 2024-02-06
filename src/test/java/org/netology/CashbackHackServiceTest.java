package org.netology;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemainThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = cashbackHackService.remain(amount);
        int  actual = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.bonus(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }


}