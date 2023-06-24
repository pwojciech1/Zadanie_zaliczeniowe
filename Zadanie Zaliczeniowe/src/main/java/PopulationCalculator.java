package com.populationtracker;

import com.populationtracker.populationdata.CountryPopulation;

public class PopulationCalculator {
    public static int calculatePopulation(CountryPopulation country) {
        int totalPopulation = country.getInitialPopulation();
        int birthRate = country.getBirthRate();
        int deathRate = country.getDeathRate();
        int years = country.getYears();

        for (int i = 0; i < years; i++) {
            totalPopulation += (totalPopulation * birthRate / 100) - (totalPopulation * deathRate / 100);
        }

        return totalPopulation;
    }
}