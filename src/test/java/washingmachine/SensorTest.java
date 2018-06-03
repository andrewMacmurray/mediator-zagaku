package washingmachine;

import org.junit.Test;
import washingmachine.Sensor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SensorTest {

    @Test
    public void checkTemp() {
        Sensor sensor = new Sensor(40);

        assertTrue(sensor.checkTemperatureHighEnough(40));
        assertFalse(sensor.checkTemperatureHighEnough(35));
    }

}
