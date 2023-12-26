package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {


    @Test
    public void shouldReturn200at800() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1at999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999at1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0at1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999at1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }

}