public class Bike implements Vehicle {
    @Override
    public void getName() {
        try {
            System.out.println("Bike");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Bike is running...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void stop() {
        try {
            System.out.println("Bike stopped!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void fly() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
