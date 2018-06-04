package doubles;

import washingmachine.mediator.Mediator;

public class MediatorSpy extends Mediator {

    public boolean startCalled = false;
    public boolean valveOpenedCalled = false;
    public boolean adjustTemperatureCalled = false;
    public boolean checkTemperatureCalled = false;
    public int checkedTemperature;
    public boolean temperatureReachedCalled = false;
    public boolean motorStoppedCalled = false;
    public boolean finishedCalled = false;

    @Override
    public void start() {
        startCalled = true;
    }

    @Override
    public void valveOpened() {
        valveOpenedCalled = true;
    }

    @Override
    public void adjustTemperature() {
        adjustTemperatureCalled = true;
    }

    @Override
    public void checkTemperature(int temperature) {
        checkTemperatureCalled = true;
        checkedTemperature = temperature;
    }

    @Override
    public void temperatureReached() {
        temperatureReachedCalled = true;
    }

    @Override
    public void motorStopped() {
        motorStoppedCalled = true;
    }

    @Override
    public void finished() {
        finishedCalled = true;
    }
}
