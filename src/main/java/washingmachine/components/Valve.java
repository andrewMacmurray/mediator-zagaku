package washingmachine.components;

import washingmachine.mediator.Mediator;

public class Valve {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void openValve() {
        System.out.println("opened valve");
        mediator.valveOpened();
    }

    public void closeValve() {
        System.out.println("valve closing...");
        mediator.finished();
    }

}
