package main;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {
    private static ChampionshipManager instance;

    private List<Driver> drivers;
    private List<RallyRaceResult> races;
    private static int totalDrivers = 0;
    private static int totalRaces = 0;

    private ChampionshipManager() {
        this.drivers = new ArrayList<>();
        this.races = new ArrayList<>();
    }

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
        totalDrivers++;
    }

    public void addRaceResults(RallyRaceResult result) {
        races.add(result);
        totalRaces++;
    }

    public List<Driver> getDriverStandings() {
        List<Driver> standings = new ArrayList<>(drivers);
        standings.sort((d1, d2) -> d2.getPoints() - d1.getPoints());
        return standings;
    }

    public static Driver getLeadingDriver() {
        List<Driver> standings = getInstance().getDriverStandings();
        return standings.get(0);
    }

    public static int getTotalChampionshipPoints() {
        int totalPoints = 0;
        for (Driver driver : getInstance().drivers) {
            totalPoints += driver.getPoints();
        }
        return totalPoints;
    }

    public static int getTotalDrivers() {
        return totalDrivers;
    }

    public static int getTotalRaces() {
        return totalRaces;
    }
}
