package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public interface Encoder {
    String encode(String input) throws IOException;
}