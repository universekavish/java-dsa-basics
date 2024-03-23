package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int start = 0;
        int end = nums.length - 1;
        boolean found = false;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == nums[middle]) {
                    System.out.println("Item found at index : " + middle);
                    found = true;
                    break;
            }
            else if (target < nums[middle]) {
                end = middle - 1;
            }
            else if (target > nums[middle]) {
                start = middle + 1;
            }
        }
        if(!found) {
            System.out.println("Item not found");
        }
    }
}