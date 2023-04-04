package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> swap = new HashMap<>();

        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            Integer oldKey = e.getKey();
            String oldVal = e.getValue();
            if (!swap.containsKey(oldVal)) {
                swap.put(oldVal, oldKey);
            }
        }

        return swap;
    }
}
