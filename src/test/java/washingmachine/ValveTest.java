package washingmachine;

import doubles.MediatorSpy;
import org.junit.Before;
import org.junit.Test;
import washingmachine.components.Valve;

import static org.junit.Assert.assertTrue;

public class ValveTest {

    private MediatorSpy mediator;
    private Valve valve;

    @Before
    public void setup() {
        mediator = new MediatorSpy();
        valve = new Valve();
        valve.setMediator(mediator);
    }

    @Test
    public void openValve() {
        valve.openValve();
        assertTrue(mediator.valveOpenedCalled);
    }

    @Test
    public void closeValve() {
        valve.closeValve();
        assertTrue(mediator.finishedCalled);
    }

}
