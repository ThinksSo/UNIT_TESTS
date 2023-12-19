package seminars.second.hw;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract void testDrive();

    public abstract void park();

    public Object getType() {
        return null;
    }

    public Object getColor() {
        return null;
    }

    public Object getWheels() {
        return null;
    }
}
