package doubles;

import washingmachine.Motor;
import washingmachine.Valve;

public class FakeMotor extends Motor {

    public int motorSpeed;

    public FakeMotor(Valve valve) {
        super(valve);
    }

    @Override
    public void rotateDrum(int speed) {
        motorSpeed = speed;
    }

    @Override
    public void stopMotor() {
        motorSpeed = 0;
    }

}
