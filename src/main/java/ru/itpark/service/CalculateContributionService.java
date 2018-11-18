package ru.itpark.service;

public class CalculateContributionService {
    public int calculateContribution(int sum, int years, int precent) {
        int contribution = sum;
        for (int b = 0; b < years; b++) {
            contribution = ((contribution * precent) / 100) + contribution;
        }
        return contribution;
    }

}
