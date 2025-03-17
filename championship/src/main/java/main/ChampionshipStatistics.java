package main;

import java.util.List;

public class ChampionshipStatistics {
    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        int points = 0;
        for (Driver driver : drivers) {
            points += driver.getPoints();
        }
        return (double) points / drivers.size();
    }

    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        String country = "";
        int maxPoints = 0;
        for (Driver driver : drivers) {
            if (driver.getPoints() > maxPoints) {
                maxPoints = driver.getPoints();
                country = driver.getCountry();
            }
        }
        return country;
    }

    public static int getTotalRacesHeld() {
        return ChampionshipManager.getTotalRaces();
    }
}
