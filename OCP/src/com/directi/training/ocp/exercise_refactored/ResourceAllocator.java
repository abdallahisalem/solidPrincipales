package com.directi.training.ocp.exercise_refactored;

import com.directi.training.ocp.exercise.ResourceType;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType) {
        ResourceHandler handler = ResourceHandlerFactory.createHandler(resourceType);
        if (handler != null) {
            int resourceId = handler.findFreeResource();
            handler.markResourceBusy(resourceId);
            return resourceId;
        } else {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
    }

    public void free(ResourceType resourceType, int resourceId) {
        ResourceHandler handler = ResourceHandlerFactory.createHandler(resourceType);
        if (handler != null) {
            handler.markResourceFree(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free invalid resource");
        }
    }
}
