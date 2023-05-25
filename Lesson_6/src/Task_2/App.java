package Task_2;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car(120);
        vehicles[1] = new Bus(80);
        vehicles[2] = new Car(160);
        vehicles[3] = new Bus(70);
        SpeedCalculation speedCalculation = new SpeedCalculation();
    
    for(Vehicle vehicle : vehicles) {
        double allowedSpeed = speedCalculation.calculateAllowedSpeed(vehicle);
        System.out.println(vehicle.getType() + " allowed speed: " + allowedSpeed);
    }
}
}
