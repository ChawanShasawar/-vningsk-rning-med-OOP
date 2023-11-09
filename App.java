public class App {

    public static void main(String[] args) {
        Car car = new Car(true, 10);

        car.start();
        car.accelerate();
        car.brake();
        car.stop();

    }
}