package com.epam.mjc.collections.combined;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();
        for (String str : sourceMap.keySet()) {
            if (res.containsKey(str.length())) {
                res.get(str.length()).add(str);
            } else {
                Set<String> set = new HashSet<>();
                set.add(str);
                res.put(str.length(), set);
            }
        }
        return res;
    }
}