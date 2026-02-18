public class RescueRobot implements Flyable, Drivable, ThermalSensor, Communicable {

    private String deviceId;
    private Battery battery;
    private GPSTracker gps;
    private ThermalCamera thermal;

    public RescueRobot(String deviceId) {
        this.deviceId = deviceId;
        this.battery = new Battery();
        this.gps = new GPSTracker();
        this.thermal = new ThermalCamera();
    }

    public String status() {
        return "ROBOT: " + Flyable.super.status()
                + " + " + Drivable.super.status();
    }


    public void takeOff() {
        System.out.println("Taking off...");
        battery.drain(10);
    }

    public void land() {
        System.out.println("Landing...");
        battery.drain(5);
    }

    public double maxAltitude() {
        battery.drain(2);
        return 500.0;
    }

  
    public void startEngine() {
        System.out.println("Engine started.");
        battery.drain(5);
    }

    
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    
    public double maxSpeed() {
        battery.drain(2);
        return 120.0;
    }

    public double readTemperatureC() {
        battery.drain(3);
        double temp = thermal.readTemperatureC();
        System.out.println("Temperature: " + temp);
        return temp;
    }

    public boolean detectHuman(double thresholdC) {
        battery.drain(3);
        boolean found = thermal.detectHuman(thresholdC);
        System.out.println("Human detected? " + found);
        return found;
    }


    public void send(String message) {
        battery.drain(2);
        System.out.println("ID=" + deviceId +
                ", POS=" + gps.currentPosition() +
                ", MSG=" + message);
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void updatePosition(double lat, double lon) {
        gps.updatePosition(lat, lon);
    }

    public double batteryLevel() {
        return battery.getLevel();
    }
}
