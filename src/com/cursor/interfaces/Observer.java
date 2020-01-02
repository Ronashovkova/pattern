package com.cursor.interfaces;

public interface Observer {
    default void handleEvent (double temperature, int pressure) {
    }
}