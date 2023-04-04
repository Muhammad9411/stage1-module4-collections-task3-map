package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> map = new HashMap<>();

        if (sentence.isEmpty()) {
            return map;
        }

        String s_arr[] = sentence.replaceAll("[\\,.]", "").split(" ");

        for (int i = 0; i < s_arr.length; i++) {
            int value = 1;
            String m_key = s_arr[i].toLowerCase();
            if (map.containsKey(m_key)) {
                map.put(m_key, Integer.parseInt(map.get(m_key).toString()) + value);
            } else {
                map.put(s_arr[i].toLowerCase(), value);
            }
        }

        return map;
    }
}
