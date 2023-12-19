package seminars.second.hw;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void testCarInstanceIsVehicle() {
        Car car = new Car(null, null, 0);
        Assert.assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car(null, null, 0);
        Assert.assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle(null, null, 0);
        Assert.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedInTestDriveMode() {
        Car car = new Car(null, null, 0);
        car.testDrive();
        Assert.assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedInTestDriveMode() {
        Motorcycle motorcycle = new Motorcycle(null, null, 0);
        motorcycle.testDrive();
        Assert.assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsInParkMode() {
        Car car = new Car(null, null, 0);
        car.testDrive();
        car.park();
        Assert.assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsInParkMode() {
        Motorcycle motorcycle = new Motorcycle(null, null, 0);
        motorcycle.testDrive();
        motorcycle.park();
        Assert.assertEquals(0, motorcycle.getSpeed());
    }
}

