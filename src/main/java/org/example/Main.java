package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day 1 High Temperature (e.g., 28.5): ");
        TemperatureAnalyzer day1TempStr = new TemperatureAnalyzer(scanner.nextLine(), "Day 1");
        System.out.print("Enter Day 2 High Temperature (e.g., 28.5): ");
        TemperatureAnalyzer day2TempStr = new TemperatureAnalyzer(scanner.nextLine(), "Day 2");
        System.out.print("Enter Day 3 High Temperature (e.g., 28.5): ");
        TemperatureAnalyzer day3TempStr = new TemperatureAnalyzer(scanner.nextLine(), "Day 3");

        System.out.println("\n--- Temperature Analysis ---\n");
        System.out.println("Parsed Day 1 Temp (primitive double): " + day1TempStr.getPrimitiveValue());
        System.out.println("Parsed Day 2 Temp (primitive double): " + day2TempStr.getPrimitiveValue());
        System.out.println();

        day1TempStr.compareWith(day2TempStr, "Day 1", "Day 2");

        System.out.println();
        System.out.println("Extracted Day 1 Temp (primitive float from Double wrapper): " + day1TempStr.getWrapperValue().floatValue());
        System.out.println("Extracted Day 2 Temp (primitive int from Double wrapper, truncated): " + day2TempStr.getWrapperValue().intValue());
        System.out.println();

        TemperatureAnalyzer max = MaxTemperature.getHottestDay(List.of(day1TempStr, day2TempStr, day3TempStr));
        System.out.println("The highest temperature recorded was: " + max.getWrapperValue() + "°C");
    }
}
