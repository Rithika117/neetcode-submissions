class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        // Step 1: Reverse entire array
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Step 2: Reverse first k elements
        left = 0;
        right = k - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Step 3: Reverse remaining elements
        left = k;
        right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}