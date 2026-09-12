class MyCircularQueue {
    private final int[] data;
    private final int capacity;
    private int front;
    private int rear;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.data = new int[k];
        this.rear = -1;
        this.front = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }    
        if(isEmpty()) {
            front = 0;
        }
        rear = (rear+1)%capacity;
        data[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) {
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
    
    public int Front() {
        if(isEmpty()) {
            return -1;
        }    
        return data[front];
    }
    
    public int Rear() {
        if(isEmpty()) {
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
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */