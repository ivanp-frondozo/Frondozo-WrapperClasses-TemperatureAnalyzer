package org.example;

import java.util.List;

public class MaxTemperature {
    public static TemperatureAnalyzer getHottestDay(List<TemperatureAnalyzer> temps) {
        if (temps == null || temps.isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid temperature");
        }

        TemperatureAnalyzer hottest = temps.get(0);
        for (TemperatureAnalyzer temp : temps) {
            if (temp.getWrapperValue() > hottest.getWrapperValue()) {
                hottest = temp;
            }
        }
        return hottest;
    }
}
