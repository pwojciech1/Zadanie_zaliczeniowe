package com.populationdata;

/**
 * Klasa przechowująca dane demograficzne dla kraju.
 */
public class CountryPopulation {
    private String countryName;
    private int initialPopulation;
    private int birthRate;
    private double deathRate;
    private int years;

    public CountryPopulation(String countryName, int initialPopulation, int birthRate, double deathRate, int years) {
        this.countryName = countryName;
        this.initialPopulation = initialPopulation;
        this.birthRate = birthRate;
        this.deathRate = deathRate;
        this.years = years;
    }

    // Gettery i Settery

    /**
     * Zwraca nazwę kraju.
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Ustawia nazwę kraju.
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Zwraca początkową liczbę ludności kraju.
     */
    public int getInitialPopulation() {
        return initialPopulation;
    }

    /**
     * Ustawia początkową liczbę ludności kraju.
     */
    public void setInitialPopulation(int initialPopulation) {
        this.initialPopulation = initialPopulation;
    }

    /**
     * Zwraca wskaźnik urodzeń kraju (w procentach).
     */
    public int getBirthRate() {
        return birthRate;
    }

    /**
     * Ustawia wskaźnik urodzeń kraju (w procentach).
     */
    public void setBirthRate(int birthRate) {
        this.birthRate = birthRate;
    }

    /**
     * Zwraca wskaźnik zgonów kraju (w procentach).
     */
    public double getDeathRate() {
        return deathRate;
    }

    /**
     * Ustawia wskaźnik zgonów kraju (w procentach).
     */
    public void setDeathRate(double deathRate) {
        this.deathRate = deathRate;
    }

    /**
     * Zwraca liczbę lat dla obliczenia przyszłej populacji.
     */
    public int getYears() {
        return years;
    }

    /**
     * Ustawia liczbę lat dla obliczenia przyszłej populacji.
     */
    public void setYears(int years) {
        this.years = years;
    }
}
