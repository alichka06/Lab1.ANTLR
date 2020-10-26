package com.company;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import java.util.Scanner;


public class Main {
    static void calculation(double left_value, double right_value, double step, String expr) {
        try {
            Calculate calc = new Calculate();

            double[][] data = calc.Run(left_value, right_value, step, expr);
            int size = (int) ((right_value - left_value) / step) + 1;
            for (int i = 0; i < size; ++i) {
                System.out.println(data[0][i] + " " + data[1][i]);
            }

            final XYChart chart =
                    QuickChart.getChart(
                            "Function", "X", "Y", "line", data[0], data[1]);

            final SwingWrapper<XYChart> sw = new SwingWrapper<XYChart>(chart);
            sw.displayChart();
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input expression: ");
        String expr = in.next();
        System.out.print("Input range: ");
        double left_value = in.nextDouble();
        double right_value = in.nextDouble();
        System.out.print("Input step: ");
        double step = in.nextDouble();
        in.close();

        calculation(left_value, right_value, step, expr);
    }
}
