package Questions;

import java.util.Arrays;

public class Set_MisMatch {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,5,6};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }
    static int[] findErrorNums(int[] arr){
        int i = 0;
        int n = arr.length;

        while (i < n){
            int currentIndex = arr[i] - 1;

            if(arr[i] != arr[currentIndex]){
                swap(arr, i, currentIndex);
            } else {
                i++;
            }
            for (int index = 0; index < n; index++) {
                if (arr[index] != index + 1){
                    return new int[]{arr[index], index + 1};
                }

            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] =  arr[second];
        arr[second] = temp;
    }
}
