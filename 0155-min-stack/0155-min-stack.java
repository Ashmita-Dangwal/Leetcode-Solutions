class MinStack {
    private Stack<Long> stack;
    private Long min;

    public MinStack() {
        stack = new Stack<>();
        min = null;
        
    }
    
    public void push(int value) {
        long val = value;
        if(stack.isEmpty()){
            stack.push(val);
            min = val;
        }
        else{
            if(value < min){
                stack.push(2* val - min);
                min = val;
            }
            else{
                stack.push(val);
            }
        }
        
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        long top = stack.pop();
        if(top < min){
            min = 2*min - top;
        }
        if(stack.isEmpty()){
            min = null;
        }
    }
    
    public int top() {
        long top = stack.peek();
        if(top < min){
            return min.intValue();
        }
        return (int) top;
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */