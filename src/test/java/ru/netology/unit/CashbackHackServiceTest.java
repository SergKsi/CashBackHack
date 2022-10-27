package ru.netology.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackServiceTest {

    @Test
    public void testShouldReturn900IfAmount100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int amount = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldReturn300IfAmount2700() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int amount = 2700;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldReturn0IfAmount3000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 3000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}