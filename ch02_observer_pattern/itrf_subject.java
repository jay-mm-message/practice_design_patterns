package ch02_observer_pattern;

public interface itrf_subject {
    public void registerObservers();
    public void removeObservers();
    public void notifyObservers();
}
