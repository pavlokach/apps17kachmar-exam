package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    MyFunction function;

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        this.function = func;
    }


}
