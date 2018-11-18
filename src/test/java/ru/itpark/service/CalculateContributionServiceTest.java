package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateContributionServiceTest {

    @Test
    void calculateContribution() {
        CalculateContributionService calculateContribution = new CalculateContributionService();
        int contribution = calculateContribution.calculateContribution(10000,1,8);
        assertEquals(10800, contribution);
    }
}