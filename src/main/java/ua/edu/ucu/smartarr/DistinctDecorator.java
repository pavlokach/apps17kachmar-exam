package ua.edu.ucu.smartarr;

import java.lang.reflect.Array;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
//        Object[] ints = new Object[];
//        for (Object inn: smartArray.toArray()
//             ) {
//
//        }
//        smartArray
//        Object[] arr = smartArray.toArray();
//        int k = smartArray.size();
//        for (int i = 0; i < k; i++) {
//            for (int j = i + 1; j < k; j++){
//                if (arr[i].equals(arr[j])){
//                    arr[i] = "";
//                }
//            }
//        }
        super(smartArray);
    }

}
