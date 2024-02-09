package ch02_observer_pattern;

public class implt_current_conditions_display implements itrf_observer, itrf_display_element{

    public implt_weatherData weatherData;

    public implt_current_conditions_display(implt_weatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObservers(this);
    }

    @Override
    public void display() {
    }

    @Override
    public void update() {
    }
    
}
