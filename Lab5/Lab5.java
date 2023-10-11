import java.util.Arrays;

public class Lab5{
    public static void main(String[] args) throws Exception {
        float[] inputArray = {5.0f, 2.3f, 9.7f, 3.1f, 6.5f, 1.2f, 8.9f, 4.7f};
        printAllTask(inputArray);
    }
    public static float[] insertionSortDescending(float[] inputArray) {
        float[] sortedArr = Arrays.copyOf(inputArray, inputArray.length);

        int n = sortedArr.length;
        for (int i = 1; i < n; i++)
        {
            float key = sortedArr[i];
            int j = i - 1;
            
            for (;j >= 0 && sortedArr[j] < key; j--) 
            {
                sortedArr[j + 1] = sortedArr[j];
            }
            
            sortedArr[j + 1] = key;
        }
        return sortedArr;
    }
    public static float[] bubbleSortDescending(float[] inputArray) {
        float[] sortedArr = Arrays.copyOf(inputArray, inputArray.length);
        int n = sortedArr.length;
        boolean swapped;
    
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (sortedArr[i - 1] < sortedArr[i]) {
                    float temp = sortedArr[i - 1];
                    sortedArr[i - 1] = sortedArr[i];
                    sortedArr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    
        return sortedArr;
    }
    
    public static void printAllTask(float[] inputArray){
        System.out.println("inputArray:\n\t" + Arrays.toString(inputArray));

        float[] insertSortedArray = insertionSortDescending(inputArray);
        System.out.println("Insertion sort. sortedArray =\n\t" + Arrays.toString(insertSortedArray));

        float[] bubbleSortedArray = bubbleSortDescending(inputArray);
        System.out.println("Bubble sort. sortedArray =\n\t" + Arrays.toString(bubbleSortedArray));
    }
}