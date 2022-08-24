package Questions;

public class First_Positive_Number_Missing {
    public static void main(String[] args) {
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;

        while(i < n){
            int correctIndex = nums[i] - 1;

            if (nums[i] > 0 && nums[i] > n && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < n; index++) {
            if (nums[index] != index+1){
                return index+1;
            }
        }
        return n + 1;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
