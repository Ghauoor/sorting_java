package Cyclic_Sort;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr) {

        int i = 0;
         while (i < arr.length){
             int correctIndex = arr[i] - 1;
             if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                 swap(arr, i, correctIndex);
             } else {
                 i++;
             }
         }

    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
