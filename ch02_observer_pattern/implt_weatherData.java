package ch02_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class implt_weatherData implements itrf_subject {
    private List<itrf_observer> observers;
    
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
            itrf_observer.update();
        }
    }
    
    public void getTemperature() {

    }

    public void getHumidity() {

    }

    public void getPressure() {

    }

    public void measurementsChanged() {
        
    }
}
