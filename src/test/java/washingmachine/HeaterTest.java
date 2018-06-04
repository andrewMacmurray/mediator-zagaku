package washingmachine;

import doubles.MediatorSpy;
import org.junit.Test;
import washingmachine.components.Heater;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class HeaterTest {

    @Test
    public void setTemperature() {
        MediatorSpy mediatorSpy = new MediatorSpy();
        Heater heater = new Heater();
        heater.setMediator(mediatorSpy);

        heater.setTemperature(40);

        assertTrue(mediatorSpy.checkTemperatureCalled);
        assertEquals(40, mediatorSpy.checkedTemperature );
    }

}
