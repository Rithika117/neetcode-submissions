class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        long[] dp = new long[n];
        long res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            int j = stack.isEmpty() ? -1 : stack.peek();
            dp[i] = (j < 0 ? 0 : dp[j]) + (long)(i - j) * arr[i];
            res = (res + dp[i]) % MOD;
            stack.push(i);
        }
        
        return (int) res;
    }
}