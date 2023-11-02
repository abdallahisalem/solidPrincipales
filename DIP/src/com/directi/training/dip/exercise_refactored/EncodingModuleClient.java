package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        Encoder fileEncoder = new FileEncoder();
        EncodingModule encodingModuleWithFiles = new EncodingModule(fileEncoder);
        encodingModuleWithFiles.encodeWithFiles();

        Encoder networkAndDatabaseEncoder = new NetworkAndDatabaseEncoder();
        EncodingModule encodingModuleNetworkAndDatabase = new EncodingModule(networkAndDatabaseEncoder);
        encodingModuleNetworkAndDatabase.encodeBasedOnNetworkAndDatabase();
    }
}
