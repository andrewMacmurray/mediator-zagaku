package washingmachine.mediator;

import washingmachine.components.Valve;

public abstract class Mediator {

    public Valve valve;

    public void start() {
        valve.openValve();
    }

    public abstract void valveOpened();

    public abstract void adjustTemperature();

    public abstract void checkTemperature(int temperature);

    public abstract void temperatureReached();

    public void motorStopped() {
        valve.closeValve();
    }

    public void finished() {
        System.out.println("Your washing is now sparkly clean ✨");
    }

}
