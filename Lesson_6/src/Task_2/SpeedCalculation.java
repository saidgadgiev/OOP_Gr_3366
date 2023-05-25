package Task_2;

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if(vehicle instanceof AllowedSpeedCalculator) {
            return ((AllowedSpeedCalculator) vehicle).calculateAllowedSpeed();
        }
        else {
            return 0.0;
        }
        
    }
}
