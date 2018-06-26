package washingmachine.components;

import washingmachine.mediator.Mediator;

public class Heater {

    private int temperature;
    private Mediator mediator;

    public Heater() {
        this.temperature = 0;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setTemperature(int temperature) {
        System.out.println("adjusting temperature to " + temperature + " degrees");
        this.temperature = temperature;
        mediator.temperatureSet(temperature);
    }

}
