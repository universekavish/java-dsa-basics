public class InsertionSort {
    public static void main(String[] args) {
        int nums [] = {6, 9, 8, 5, 4, 2};
        int size = nums.length;

        System.out.println("Before sorting...");
        for(int num:nums) {
            System.out.print(num + " ");
        }

        for(int i = 1; i < size; i++) {
            int key = nums[i];
            int j = i - 1;

            while(j>=0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        System.out.println();
        System.out.println("after sorting...");
        for(int num:nums) {
            System.out.print(num + " ");
        }
    }
}