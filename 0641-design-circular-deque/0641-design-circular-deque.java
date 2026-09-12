class MyCircularDeque {
    private final int data[];
    private final int capacity;
    private int front;
    private int rear;
    public MyCircularDeque(int k) {
        this.capacity = k;
        this.data = new int[k];
        this.front = -1;
        this.rear = -1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }

        if(isEmpty()){
            front = 0;
            rear = 0;
        }

        else{
            front = (front-1 + capacity)%capacity;
        }
        data[front] = value;
        return true;    
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear+1)%capacity;
        }
        data[rear] = value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front+1)%capacity;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            rear = (rear-1 + capacity)%capacity;
        }
        return true;
        
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return data[front];
        
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return data[rear];
        
    }
    
    public boolean isEmpty() {
        return front == -1;
        
    }
    
    public boolean isFull() {
        return (rear+1)%capacity == front;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */