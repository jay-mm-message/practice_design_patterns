package ch02_observer_pattern;

public class implt_statistics_display implements itrf_observer, itrf_display_element {

    public implt_weatherData weatherData;
    private int numReadings;
    private float tempSum;
    private float maxTemp;
    private float minTemp;

    public implt_statistics_display(implt_weatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObservers(this);

        numReadings = 0;
        tempSum = 0;
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
        + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();      
    }

}
