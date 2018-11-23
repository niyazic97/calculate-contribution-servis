package ru.itpark.service;

public class CalculateContributionService {
    public int calculateContribution(int sum, int years, int percent) {
        int contribution = sum;
        for (int i = 0; i < years; i++) {
            contribution += ((contribution * percent) / 100) ;
        }
        return contribution;

    }

}
