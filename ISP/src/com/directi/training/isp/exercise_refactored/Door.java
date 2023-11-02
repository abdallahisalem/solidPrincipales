package com.directi.training.isp.exercise_refactored;

public interface Door extends Lockable, Openable {
    void timeOutCallback();
    void proximityCallback();
}
