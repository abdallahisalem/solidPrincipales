package com.directi.training.ocp.exercise_refactored;

public interface ResourceHandler {
    int findFreeResource();
    void markResourceBusy(int resourceId);
    void markResourceFree(int resourceId);
}
