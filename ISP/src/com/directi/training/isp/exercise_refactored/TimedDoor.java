package com.directi.training.isp.exercise_refactored;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TimedDoor implements Door {
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer) {
        timer.register(TIME_OUT, this);
    }

    @Override
    public void timeOutCallback() {
        _locked = true;
    }

    @Override
    public void proximityCallback() {
        throw new NotImplementedException();
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
