package com.directi.training.ocp.exercise_refactored;

public class TimeSlotHandler implements ResourceHandler {
    @Override
    public int findFreeResource() {
        // Logique pour trouver une plage horaire disponible
        return 0;
    }

    @Override
    public void markResourceBusy(int resourceId) {
        // Logique pour marquer une plage horaire comme occupée
    }

    @Override
    public void markResourceFree(int resourceId) {
        // Logique pour marquer une plage horaire comme libre
    }
}
