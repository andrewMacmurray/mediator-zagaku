package washingmachine;

import doubles.MediatorSpy;
import org.junit.Before;
import org.junit.Test;
import washingmachine.components.Sensor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SensorTest {

    private MediatorSpy mediatorSpy;
    private Sensor sensor;

    @Before
    public void setup() {
        mediatorSpy = new MediatorSpy();
        sensor = new Sensor();
        sensor.setMediator(mediatorSpy);
    }

    @Test
    public void notReachedRequiredTemp() {
        sensor.setRequiredTemp(40);
        sensor.checkTemperatureHighEnough(30);
        assertFalse(mediatorSpy.temperatureReachedCalled);
    }

    @Test
    public void checkRequiredTemp() {
        sensor.setRequiredTemp(40);
        sensor.checkTemperatureHighEnough(40);
        assertTrue(mediatorSpy.temperatureReachedCalled);
    }

}
