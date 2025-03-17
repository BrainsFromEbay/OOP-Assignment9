package main;

public class AsphaltCar extends RallyCar {
    private int downforce;

    public AsphaltCar(String make, String model, int horsepower, int downforce) {
        super(make, model, horsepower);
        this.downforce = downforce;
    }

    public double getDownforce() {
        return downforce;
    }

    //This formula is completely random and doesn't really mean anything. It just produces a number.
    @Override
    public double calculatePerformance() {
        return getHorsepower() * 0.5 + downforce + 150;
    }
}
