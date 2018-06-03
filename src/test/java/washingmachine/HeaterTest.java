package washingmachine;

import doubles.FakeMotor;
import doubles.FakeValve;
import org.junit.Before;
import org.junit.Test;
import washingmachine.Heater;
import washingmachine.Motor;
import washingmachine.Valve;

import static org.junit.Assert.assertEquals;

public class HeaterTest {

    private FakeMotor fakeMotor;
    private Heater heater;

    @Before
    public void setup() {
        FakeValve fakeValve = new FakeValve();
        fakeMotor = new FakeMotor(fakeValve);
        heater = new Heater(fakeMotor);
    }

    @Test
    public void setLowTemperature() {
        fakeMotor.rotateDrum(700);

        heater.setTemperature(35);
        assertEquals(fakeMotor.motorSpeed, 700);
    }

    @Test
    public void setTemperature() {
        heater.setTemperature(40);
        assertEquals(fakeMotor.motorSpeed, 0);
    }

}
