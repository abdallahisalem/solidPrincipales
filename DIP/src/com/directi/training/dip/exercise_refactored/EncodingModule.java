package com.directi.training.dip.exercise_refactored;

import java.io.*;
import java.net.URL;
import java.util.Base64;

import com.directi.training.dip.exercise.MyDatabase;

public class EncodingModule {
    private final Encoder encoder;

    public EncodingModule(Encoder encoder) {
        this.encoder = encoder;
    }

    public void encodeWithFiles() throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"));
            writer = new BufferedWriter(new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = encoder.encode(aLine);
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException
    {
        URL url;
        url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}
