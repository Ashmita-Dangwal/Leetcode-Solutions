class FrontMiddleBackQueue {
    private Deque<Integer> left;
    private Deque<Integer> right;

    public FrontMiddleBackQueue() {
       left = new ArrayDeque<>();
       right = new ArrayDeque<>(); 
    }

    private void balance(){
        if(left.size() > right.size()){
            right.offerFirst(left.pollLast());
        }
        else if(right.size() > left.size()+1){
            left.offerLast(right.pollFirst());
        }
    }
    
    public void pushFront(int val) {
       left.offerFirst(val);
       balance(); 
    }
    
    public void pushMiddle(int val) {
        if(left.size() < right.size()){
            left.offerLast(val);
        }
        else{
            right.offerFirst(val);
        }
        balance();
    }
    
    public void pushBack(int val) {
        right.offerLast(val);
        balance();
    }
    
    public int popFront() {
        if(isEmpty()) return -1;

        int val;
        if(!left.isEmpty()){
            val = left.pollFirst();
        }
        else{
            val = right.pollFirst();
        }
        balance();
        return val;
    }
    
    public int popMiddle() {
        if(isEmpty()) return -1;

        int val;
        if(left.size() == right.size()){
            val = left.pollLast();
        }
        else{
            val = right.pollFirst();
        }
        balance();
        return val;
    }
    
    public int popBack() {
        if(isEmpty()) return -1;
        int val = right.pollLast();
        balance();
        return val;
    }

    public boolean isEmpty(){
        return left.isEmpty() && right.isEmpty();
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */