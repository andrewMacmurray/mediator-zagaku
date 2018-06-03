package washingmachine;

public class WashingMachine {

    private Valve valve = new Valve();

    public void start() {
        valve.openValve();
    }

}
