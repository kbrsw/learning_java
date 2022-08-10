
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;

import java.awt.*;
import java.io.File;
import java.io.IOException;


public class graph {

    public static double fun(double x) {

        return Math.sin(Math.log10(x));
    }

    public static void cycle() throws IOException {
//      Compose dataset from our functions. Object dataset1 from class XYDataset
        XYDataset dataset1 = DatasetUtilities.sampleFunction2D(x -> fun(x), 0, 10, 1000, "Function");

//      Creating chart from class JFreeChart
        final JFreeChart chart = ChartFactory.createScatterPlot("Function", "x", "sin(x)", dataset1, PlotOrientation.VERTICAL, true, true, false);

//      Create chartpanel and include it to chart
        ChartPanel chartPanel = new ChartPanel(chart);

//      Customization of chartpanel
        chartPanel.setPreferredSize(new Dimension(500, 270));

//      Add frame
        ApplicationFrame frame = new ApplicationFrame("Example");

        frame.setContentPane(chartPanel);
        frame.pack();
//      Set frame visible
        frame.setVisible(true);

    }

    public static void main(String[] args) throws IOException {
        cycle();
    }
}