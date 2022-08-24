package Bubble_Sort;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 22, 9, 56,7,34,66,34,3,234,34,32,-2};
        bubbleSort(arr);
        System.out.println("Ascending Order of given array is : "+Arrays.toString(arr));
        desSorting(arr);
        System.out.println("Descending Order of given array is : "+Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swap = false;

        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {

            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item

                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            // if the array is sorted so no swap is occurred so
            if (!swap)
                break;
        }

    }
    static void desSorting(int[] arr){
        boolean isSwap = false;
        for (int i = 0; i< arr.length ; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] > arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap)
                break;
        }
    }

}
