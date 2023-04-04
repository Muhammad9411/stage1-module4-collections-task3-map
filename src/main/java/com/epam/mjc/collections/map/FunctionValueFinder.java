package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        boolean result = false;
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        for (Map.Entry<Integer, Integer> e : functionMap.entrySet()) {
            if (e.getValue().equals(requiredValue)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer s : sourceList) {
            map.put(s, s * 5 + 2);
        }

        return map;
    }
}
