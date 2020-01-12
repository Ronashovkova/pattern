package com.cursor.models;

import com.cursor.interfaces.Observed;
import com.cursor.interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observed {
    private double temperature;
    private int pressure;
    private List<Observer> observers = new ArrayList<>();

    public void setMeasurements(double temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.handleEvent(temperature, pressure);
        }
    }
}
