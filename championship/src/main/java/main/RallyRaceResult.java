package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RallyRaceResult implements RaceResult {
    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    public RallyRaceResult(String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
        this.results = new HashMap<>();
    }

    public String getRaceName() {
        return raceName;
    }

    public String getLocation() {
        return location;
    }

    public void recordResult(Driver driver, int position, int points) {
        driver.addPoints(points);
        results.put(driver, points);
    }

    @Override
    public int getDriverPoints(Driver driver) {
        return results.get(driver);
    }

    public List<Driver> getResults() {
        List<Driver> driverList = new ArrayList<>(results.keySet());
        driverList.sort(Comparator.comparing(driver -> results.get(driver)));
        return driverList;
    }

    @Override
    public String toString() {
        return "Race: " + raceName + " (" + location + ")";
    }
}
