package com.populationtracker;

import com.populationtracker.populationdata.CountryPopulation;
import com.populationtracker.util.LoggerUtil;

public class PopulationTracker {
    public static void main(String[] args) {
        LoggerUtil.logInfo("Starting Population Tracker...");

        // Przykładowe dane dla kraju
        CountryPopulation country = new CountryPopulation("Poland", 38000000, 1, 0.5, 10);

        int finalPopulation = PopulationCalculator.calculatePopulation(country);
        System.out.println("Final population of " + country.getCountryName() + ": " + finalPopulation);

        LoggerUtil.logInfo("Population Tracker finished.");
    }
}
