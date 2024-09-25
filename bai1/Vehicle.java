package bai1;

public interface Vehicle {
    void getName();

    void run();

    void stop();

    void fly();

    default public String isNameUppecase(String name) {
        return name.toUpperCase();
    }
}

