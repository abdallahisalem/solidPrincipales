package com.directi.training.ocp.exercise_refactored;

import com.directi.training.ocp.exercise.ResourceType;

public class ResourceHandlerFactory {
    public static ResourceHandler createHandler(ResourceType resourceType) {
        if (resourceType == ResourceType.TIME_SLOT) {
            return new TimeSlotHandler();
        } else if (resourceType == ResourceType.SPACE_SLOT) {
            return new SpaceSlotHandler();
        }
        return null; // Handle other resource types as needed
    }
}
