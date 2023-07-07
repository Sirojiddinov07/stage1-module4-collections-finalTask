package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> newlist = new ArrayList<>();
        for (Map.Entry<String, Set<String>> project : projects.entrySet()) {
            if (project.getValue().contains(developer))
                newlist.add(project.getKey());
        }
        newlist.sort((o1, o2) -> {
            if (o1.length() < o2.length())
                return 1;
            else if (o1.length() > o2.length())
                return -1;
            else
                return o1.compareTo(o2) * -1;
        });
        return newlist;
    }
}