package ch02_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class implt_weatherData implements itrf_subject {
    private List<itrf_observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;
    
    public implt_weatherData() {
        observers = new ArrayList<itrf_observer>();
    }
    @Override
    public void registerObservers(itrf_observer obsr) {
        observers.add(obsr);
    }

    @Override
    public void removeObservers(itrf_observer obsr) {
        observers.remove(obsr);
    }

    @Override
    public void notifyObservers() {
        for (itrf_observer itrf_observer : observers) {
            itrf_observer.update(getTemperature(), getHumidity(), getPressure());
        }
    }
    
    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

    public void measurementsChanged() {
        
    }
}
