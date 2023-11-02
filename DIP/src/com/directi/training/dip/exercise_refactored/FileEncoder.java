package com.directi.training.dip.exercise_refactored;

import java.util.Base64;

public class FileEncoder implements Encoder {
    @Override
    public String encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }
}