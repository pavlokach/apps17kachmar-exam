package ua.edu.ucu.smartarr;

import java.lang.reflect.Array;

// Base array for decorators
public class BaseArray implements SmartArray{
    public Integer[] integers;

    public BaseArray(Integer[] integers) {
        this.integers = integers;
    }

    @Override
    public Object[] toArray() {
        return integers;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return integers.length;
    }

}
