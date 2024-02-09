package ch02_observer_pattern;

public interface itrf_observer {
    public void update(float temperature, float humidity, float pressure);
}
