package week1.dsa;
import java.util.List;
public class FinancialForecast {
       public static double[] movingAverage(int[] data, int window) {
        double[] result = new double[data.length - window + 1];

        for (int i = 0; i < result.length; i++) {
            int sum = 0;
            for (int j = i; j < i + window; j++) {
                sum += data[j];
            }
            result[i] = (double) sum / window;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] revenue = {100, 200, 300, 400, 500, 600};
        int windowSize = 3;

        double[] forecast = movingAverage(revenue, windowSize);

        System.out.println("Forecast:");
        for (double val : forecast) {
            System.out.printf("%.2f ", val);
        }
    }
}
