package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import com.directi.training.dip.exercise.MyDatabase;

public class NetworkAndDatabaseEncoder implements Encoder {
    @Override
    public String encode(String input) throws IOException {
        URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        MyDatabase database = new MyDatabase();
        database.write(input);
        return inputString;
    }
}
