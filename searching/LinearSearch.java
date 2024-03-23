package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 4, 5, 6};
        int target = 7;

        for (int i = 0; i <= nums.length - 1; i ++) {
            if (nums[i] == target) {
                System.out.println("Item found at index : " + i);
                break;
            }
        }
        System.out.println("Item not found");
    }
}