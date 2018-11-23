package ru.itpark.service;

public class CalculateContributionService {
    public int calculateContribution(int sum, int years, int percent) {
        int contribution = sum;
        for (int b = 0; b < years; b++) {
            contribution += ((contribution * percent) / 100) ;
        }
        return contribution;

    }

}
