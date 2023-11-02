package com.directi.training.ocp.exercise_refactored;

public class SpaceSlotHandler implements ResourceHandler {
    @Override
    public int findFreeResource() {
        // Logique pour trouver un emplacement d'espace disponible
        return 0;
    }

    @Override
    public void markResourceBusy(int resourceId) {
        // Logique pour marquer un emplacement d'espace comme occupé
    }

    @Override
    public void markResourceFree(int resourceId) {
        // Logique pour marquer un emplacement d'espace comme libre
    }
}
