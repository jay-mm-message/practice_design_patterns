package ch02_observer_pattern;

public class implt_third_party_display implements itrf_observer, itrf_display_element{

    public implt_weatherData weatherData;

    public implt_third_party_display(implt_weatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
    }

    @Override
    public void update() {
    }
    
}
