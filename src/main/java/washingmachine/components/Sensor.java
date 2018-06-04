package washingmachine.components;

import washingmachine.mediator.Mediator;

public class Sensor {

    private int requiredTemp;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setRequiredTemp(int requiredTemp) {
        this.requiredTemp = requiredTemp;
    }

    public void checkTemperatureHighEnough(int temp) {
        if (temp >= requiredTemp) {
            System.out.println("Required temperature Reached");
            mediator.temperatureReached();
        }
    }

}
