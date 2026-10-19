class Solution {
    public int sumSubarrayMins(int[] arr) {
        long MOD = 1000000007L;
        long res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= arr.length; i++) {
            int curr = (i == arr.length) ? 0 : arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] > curr) {
                int index = stack.pop();
                int left = stack.isEmpty()
                        ? index + 1
                        : index - stack.peek();
                int right = i - index;
                long con=((long) arr[index] * left * right) % MOD;
                res = (res + con) % MOD;
            }
            if (i < arr.length) {
                stack.push(i);
            }
        }
        return (int) res;
    }
}
