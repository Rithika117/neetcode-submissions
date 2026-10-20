class Solution {
    public int calPoints(String[] op) {
        Stack<Integer>stack=new Stack<>();
        int z=0;
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
                int top=stack.pop();
                int y=stack.peek()+top;
                stack.push(top);
                stack.push(y);
            }
            else if(op[i].equals("C")){
                stack.pop();
            }
            else if(op[i].equals("D")){
                int x=2*stack.peek();
                stack.push(x);
            }
            else{
                stack.push(Integer.parseInt(op[i]));
            }
        }
        while(!stack.isEmpty()){
            z+=stack.pop();
        }return z;
    }
}