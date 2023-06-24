package com.populationtracker;

import com.populationtracker.populationdata.CountryPopulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PopulationTrackerTest {
    @Test
    void testCalculatePopulation() {
        // Przykładowe dane
        CountryPopulation country = new CountryPopulation("Germany", 83000000, 0.8, 0.4, 20);

        int finalPopulation = PopulationCalculator.calculatePopulation(country);
        Assertions.assertEquals(93447024, finalPopulation);
    }
}
