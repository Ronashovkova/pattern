package com.cursor;
import com.cursor.models.ConsoleObserver;
import com.cursor.models.FileObserver;
import com.cursor.models.WeatherStation;

public class Executor {
    public static void start() {
        WeatherStation station = new WeatherStation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMeasurements(25, 760);
        station.setMeasurements(-5, 745);
    }
}
