
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        Stack<Integer> stack = new Stack<>();
        long totalSum = 0;
        
        for (int i = 0; i <= arr.length; i++) {
            while (!stack.isEmpty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                long leftCount = mid - (stack.isEmpty() ? -1 : stack.peek());
                long rightCount = i - mid;
                totalSum = (totalSum + arr[mid] * leftCount % MOD * rightCount) % MOD;
            }
            stack.push(i);
        }
        
        return (int) totalSum;
    }
}