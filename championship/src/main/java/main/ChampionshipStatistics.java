package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChampionshipStatistics {
    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        int points = 0;
        for (Driver driver : drivers) {
            points += driver.getPoints();
        }
        return (double) points / drivers.size();
    }

    //Cycle through all the drivers and return the one's country with the most points. 
    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        Map<String, Integer> countryPoints = new HashMap<>();
        for (Driver driver : drivers) {
            String country = driver.getCountry();
            int points = driver.getPoints();
            countryPoints.put(country, countryPoints.getOrDefault(country, 0) + points);
        }

        String country = "";
        int maxPoints = 0;
        for (Map.Entry<String, Integer> entry : countryPoints.entrySet()) {
            if (entry.getValue() > maxPoints) {
                country = entry.getKey();
                maxPoints = entry.getValue();
            }
        }
        return country;
    }

    public static int getTotalRacesHeld() {
        return ChampionshipManager.getTotalRaces();
    }
}
