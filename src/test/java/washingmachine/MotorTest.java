package washingmachine;

import doubles.MediatorSpy;
import org.junit.Before;
import org.junit.Test;
import washingmachine.components.Motor;

import static org.junit.Assert.assertTrue;

public class MotorTest {

    private MediatorSpy mediatorSpy;
    private Motor motor;

    @Before
    public void setup() {
        mediatorSpy = new MediatorSpy();
        motor = new Motor();
        motor.setMediator(mediatorSpy);
    }

    @Test
    public void rotateDrum() {
        motor.rotateDrum(700);
        assertTrue(mediatorSpy.adjustTemperatureCalled);
    }

    @Test
    public void stopMotor() {
        motor.stopMotor();
        assertTrue(mediatorSpy.motorStoppedCalled);
    }

}
