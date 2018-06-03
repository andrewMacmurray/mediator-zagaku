package washingmachine;

public class Sensor {

    private int requiredTemp;

    public Sensor(int requiredTemp) {
        this.requiredTemp = requiredTemp;
    }

    public boolean checkTemperatureHighEnough(int temp) {
        return temp >= requiredTemp;
    }

}
