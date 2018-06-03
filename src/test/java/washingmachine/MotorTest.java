package washingmachine;

import doubles.FakeValve;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class MotorTest {

    private FakeValve fakeValve;
    private Motor motor;

    @Before
    public void setup() {
        fakeValve = new FakeValve();
        motor = new Motor(fakeValve);
    }

    @Test
    public void stopMotor() {
        motor.stopMotor();
        assertFalse(fakeValve.valveOpen);
    }

    @Test
    public void startMotor() {
        motor.rotateDrum(700);
        assertFalse(fakeValve.valveOpen);
    }

}
