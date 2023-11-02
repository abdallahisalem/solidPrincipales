package com.directi.training.isp.exercise_refactored;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
public class SensingDoor implements Door {
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor) {
        sensor.register(this);
    }

    @Override
    public void timeOutCallback() {
        throw new NotImplementedException();
    }

    @Override
    public void proximityCallback() {
        _opened = true;
    }

    @Override
    public void lock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lock'");
    }

    @Override
    public void unlock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unlock'");
    }

    @Override
    public void open() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'open'");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
}
