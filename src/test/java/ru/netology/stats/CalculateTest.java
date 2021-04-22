package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    private final int[] SALES = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private final Calculate SERVICE = new Calculate();

    @org.junit.jupiter.api.Test


    public void shouldCalculateSumOfSales() {
        assertEquals(180, SERVICE.sumOfSales(this.SALES));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateAverageSales() {
        assertEquals(15, SERVICE.averageSales(this.SALES));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateMonthOfMinSales() {
        assertEquals(9, SERVICE.monthOfMinSales(this.SALES));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateMonthOfMaxSales() {
        assertEquals(8, SERVICE.monthOfMaxSales(this.SALES));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculatelessThanAverage() {
        assertEquals(5, SERVICE.lessThanAverage(this.SALES));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateMoreThanAverage() {
        assertEquals(5, SERVICE.moreThanAverage(this.SALES));
    }

}


