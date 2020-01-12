package com.cursor.models;
import com.cursor.interfaces.Observer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    public void handleEvent(double temperature, int pressure) {
        File file;
        try {
            file = File.createTempFile("TempPressure", ".txt");
            PrintWriter pw = new PrintWriter(file);
            pw.print("The weather has changed. " +
                    "The temperature is " + temperature + ", the air pressure is " + pressure + ".");
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
