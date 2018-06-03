package washingmachine;

public class Heater {

    private int temperature;
    private Sensor sensor;
    private Motor motor;

    public Heater(Motor motor) {
        this.motor = motor;
        this.temperature = 0;
        this.sensor = new Sensor(40);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("heating the washing machine to " + temperature + " degrees");

        if (sensor.checkTemperatureHighEnough(temperature)) {
            motor.stopMotor();
        }
    }

}
