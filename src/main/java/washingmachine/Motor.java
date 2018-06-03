package washingmachine;

public class Motor {

    private int speed;
    private Heater heater;
    private Valve valve;

    public Motor(Valve valve) {
        speed = 0;
        heater = new Heater(this);
        this.valve = valve;
    }

    public void rotateDrum(int speed) {
        this.speed = speed;
        System.out.println("Motor is spinning at " + speed + " rpm");
        heater.setTemperature(40);
    }

    public void stopMotor() {
        this.speed = 0;
        System.out.println("Motor stopping...");
        valve.closeValve();
    }

}
