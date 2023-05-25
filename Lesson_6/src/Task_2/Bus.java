package Task_2;

public class Bus extends Vehicle implements AllowedSpeedCalculator{
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }

}
