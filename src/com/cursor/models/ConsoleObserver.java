package com.cursor.models;
import com.cursor.interfaces.Observer;

public class ConsoleObserver implements Observer {
    public void handleEvent (double temperature, int pressure) {
        System.out.println("The weather has changed. " +
                "The air temperature is " + temperature + ", the air pressure is " + pressure + ".");
    }
}
