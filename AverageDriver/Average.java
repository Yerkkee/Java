import java.util.Arrays;
import java.util.Scanner;

public class Average {

    //Attributes:
    int[] data = new int[5];
    double mean;
    int i = 0;
    Scanner sc = new Scanner(System.in);

    public Average() {
        while (i < data.length) {
            System.out.println("Enter data " + (i + 1) + " number: ");
            data[i] = sc.nextInt();
            i++;
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        double sum = 0;
        for (int k = 0; k < data.length; k++) {
            sum += data[k];
        }
        mean = sum / data.length;
    }

    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = data[index];
            data[index] = data[i];
            data[i] = smallerNumber;
        }
    }

    @Override
    public String toString() {
        return "Average{" +
                "data=" + Arrays.toString(data) +
                ", mean=" + mean +
                '}';
    }
}


