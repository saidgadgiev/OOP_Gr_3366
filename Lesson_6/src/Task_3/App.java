package Task_3;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());
    
        Cube cube = new Cube(3);
        System.out.println("Area of cube: " + cube.area());
        System.out.println("Volume of cube: " + cube.volume());
    }
}
