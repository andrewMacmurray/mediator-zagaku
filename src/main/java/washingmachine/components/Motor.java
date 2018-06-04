package washingmachine.components;

import washingmachine.mediator.Mediator;

public class Motor {

    private int speed = 0;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void rotateDrum(int speed) {
        this.speed = speed;
        System.out.println("Motor is spinning at " + speed + " rpm");
        mediator.adjustTemperature();
    }

    public void stopMotor() {
        this.speed = 0;
        System.out.println("Motor stopping...");
        mediator.motorStopped();
    }

}
