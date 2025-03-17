package main;

public class GravelCar extends RallyCar {
    private double suspensionTravel;

    public GravelCar(String make, String model, int horsepower, double suspensionTravel) {
        super(make, model, horsepower);
        this.suspensionTravel = suspensionTravel;
    }

    public double getSuspensionTravel() {
        return suspensionTravel;
    }

    //This formula is completely random and doesn't really mean anything. It just produces a number.
    @Override
    public double calculatePerformance() {
        return getHorsepower() * 0.5 + suspensionTravel + 100;
    }
}