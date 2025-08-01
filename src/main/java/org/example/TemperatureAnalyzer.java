package org.example;

public class TemperatureAnalyzer {
    private Double wrapperValue;
    private final String label;

    public TemperatureAnalyzer(String input, String label) {
        this.label = label;
        try {
            this.wrapperValue = Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for " + label + ". Defaulting to 0.0.");
            this.wrapperValue = 0.0;
        }
    }

    public double getPrimitiveValue() {
        return wrapperValue;
    }

    public Double getWrapperValue() {
        return wrapperValue;
    }

    public String getLabel() {
        return label;
    }

    public void compareWith(TemperatureAnalyzer other, String labelThis, String labelOther) {
        int result = this.wrapperValue.compareTo(other.wrapperValue);
        if (result > 0) {
            System.out.println(labelThis + " (" + wrapperValue + "°C) was warmer than " + labelOther + " (" + other.wrapperValue + "°C).");
        } else if (result < 0) {
            System.out.println(labelThis + " (" + wrapperValue + "°C) was cooler than " + labelOther + " (" + other.wrapperValue + "°C).");
        } else {
            System.out.println(labelThis + " (" + wrapperValue + "°C) was the same as " + labelOther + " (" + other.wrapperValue + "°C).");
        }
    }
}
