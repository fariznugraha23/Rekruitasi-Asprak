/**
 * Created by Faishal on 13/07/2017.
 */
public class BubbleSortArray {
    public static void bubbleSort(int[] numArray) {

        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
    }

    public static void printArray(int[] x) {
        for(int i=0; i<x.length; i++)
            System.out.print(x[i] + " ");
    }

    public static void main(String[] args) {
        int[] num = {5,4,3,2,1};
        bubbleSort(num);
        printArray(num);
    }
}
