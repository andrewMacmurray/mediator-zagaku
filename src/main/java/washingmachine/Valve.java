package washingmachine;

public class Valve {

    private Motor motor;

    public Valve() {
        this.motor = new Motor(this);
    }

    public void openValve() {
        System.out.println("opened valve, starting the motor");
        motor.rotateDrum(700);
    }

    public void closeValve() {
        System.out.println("valve closing...");
        System.out.println("your washing is now sparkly clean ✨");
    }

}
