package ch02_observer_pattern;

public class implt_current_conditions_display implements itrf_observer, itrf_display_element{

    public implt_weatherData weatherData;
    private float temperature;
    private float humidity;

    public implt_current_conditions_display(implt_weatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObservers(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature 
        + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
}
