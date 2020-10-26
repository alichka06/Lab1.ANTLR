package com.company;

public class Calculate {
    public double[][]  Run(double a, double b, double k, String expr) {
        int size = (int)((b - a) / k) + 1;
        double[] xData = new double[size];
        double[] yData = new double[size];

        for (int i = 0; i < size; i++) {
            Double point = a + k * i;
            String copy = expr.replace("X", point.toString());
            xData[i] = point;
            yData[i] = EvaluateClass.evaluate(copy);
        }
        return new double[][] {xData, yData};
    }
}