package Questions;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 0};
        System.out.println(missingNumber(arr));
//        System.out.println(missNumber(arr));

    }

    static int missingNumber(int[] arr){

        int i = 0;
        int n = arr.length;

        while(i < n){
            //Due to range is o --> n
            int correctIndex = arr[i];

            if (arr[i] < n && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else
                i++;
        }
        // searching for number
        for (int index = 0; index < n; index++) {
            if (arr[index] != index){
                return index;
            }

        }
        //case 2
        return n;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    static int missNumber(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return arr.length * (arr.length + 1) / 2 - sum;
    }
}
