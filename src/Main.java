import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.function.Function2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.*;
import java.io.File;

import java.io.IOException;
import java.util.Scanner;


import javax.swing.*;


public class Main {

//    public static void print() {
//
//        System.out.println("Enter number a  ");
//        Scanner in1 = new Scanner(System.in);
//        float a = in1.nextFloat();
//
//        System.out.println("Enter number b  ");
//        Scanner in2 = new Scanner(System.in);
//        float b = in2.nextFloat();
//        float c = a + b;
//        System.out.println("Result is " + c);
//        cycle();
//
//    }
    public static void cycle() throws IOException {

//        int i;
//        int gg = (int) c;
//
//        double sum = 0;
//        double[] massiv = new double[gg];
//        for (i=1; i < gg; i++){
//            massiv[i] = i*Math.sin(i);
//            System.out.println("i = " +i);
//            System.out.println(massiv[i]);
//            sum = sum + massiv[i];
//                }

        XYDataset dataset1 = DatasetUtilities.sampleFunction2D(x -> 2*Math.sin(x), -3, 3, 1000, "Function");

//        System.out.println("Sum of massive elements is " +sum);

        final JFreeChart chart = ChartFactory.createScatterPlot("eee", "x", "y", dataset1, PlotOrientation.VERTICAL, true, true, false);
        ChartUtilities.saveChartAsPNG(new File("test.png"), chart, 500, 500);
        





    }


    public static void main(String[] args) throws IOException {
        cycle();





    }
}