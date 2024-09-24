public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.getName();
        car.run();
        car.stop();

        bike.getName();
        bike.run();
        bike.stop();

    }
}


