package ua.edu.ucu.smartarr;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.util.ArrayUtils;
import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    MyPredicate myPredicate;

    public FilterDecorator(SmartArray sa, MyPredicate pr) {
        
        super(sa);
        this.myPredicate = pr;
    }
}
