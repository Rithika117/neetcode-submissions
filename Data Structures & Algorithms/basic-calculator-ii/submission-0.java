

class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char lastOperator = '+';
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            // Build the current number if character is a digit
            if (Character.isDigit(c)) {
                currentNumber = (currentNumber * 10) + (c - '0');
            }
            
            // If it's an operator or the last character of the string
            if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                if (lastOperator == '+') {
                    stack.push(currentNumber);
                } else if (lastOperator == '-') {
                    stack.push(-currentNumber);
                } else if (lastOperator == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (lastOperator == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                
                lastOperator = c;
                currentNumber = 0;
            }
        }
        
        // Sum up all values left in the stack
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        return result;
    }
}