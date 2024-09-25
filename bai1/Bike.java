package bai1;

public class Bike implements Vehicle {
    @Override
    public void getName() {
        try {
            System.out.println("bai1.Bike");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("bai1.Bike is running...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void stop() {
        try {
            System.out.println("bai1.Bike stopped!");
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
