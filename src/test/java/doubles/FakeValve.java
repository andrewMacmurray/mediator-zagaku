package doubles;

import washingmachine.Valve;

public class FakeValve extends Valve {

    public boolean valveOpen;

    @Override
    public void openValve() {
       valveOpen = true;
    }

    @Override
    public void closeValve() {
        valveOpen = false;
    }

}
