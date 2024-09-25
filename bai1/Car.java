package bai1;

public class Car implements Vehicle {
    @Override
    public void getName() {
        try {
            System.out.println("bai1.Car");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("bai1.Car is running...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void stop() {
        try {
            System.out.println("bai1.Car stopped!");
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
