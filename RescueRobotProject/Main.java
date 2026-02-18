public class Main {
    public static void main(String[] args) {

        RescueRobot robot = new RescueRobot("RR-01");

        robot.updatePosition(13.75, 100.50);

        robot.takeOff();
        System.out.println(robot.status());
        robot.land();

        robot.startEngine();
        System.out.println("Max speed: " + robot.maxSpeed());
        robot.stopEngine();

        robot.readTemperatureC();
        robot.detectHuman(36.5);

        robot.send("Found hotspot...");

        System.out.println("Battery left: " + robot.batteryLevel() + "%");
    }
}
