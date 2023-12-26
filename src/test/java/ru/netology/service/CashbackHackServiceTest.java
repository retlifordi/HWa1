package ru.netology.service;

import static org.junit.Assert.assertEquals;


class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldReturn200at800() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn1at999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);


    }

    @org.junit.Test
    public void shouldReturn0at1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }


}