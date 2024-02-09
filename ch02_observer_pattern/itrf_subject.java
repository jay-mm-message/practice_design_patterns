package ch02_observer_pattern;

public interface itrf_subject {
    public void registerObservers(itrf_observer ob);
    public void removeObservers(itrf_observer ob);
    public void notifyObservers();
}
