package Questions;

import java.util.Arrays;

public class Find_Duplicate {
    public static void main(String[] args) {
        int[] arr ={1,4,3,2,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("Duplicate Number is: "+findDuplicate(arr));
        System.out.println("Index of Duplicate Number is: "+find_Duplicate(arr));


    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int find_Duplicate(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            return arr[i];
        }
        return -1;
    }
}

