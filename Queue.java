public class Queue {
    private int[] queueArray; // Array nga mag-store sa mga element para sa queue
    private int front; // Index sa unahan (front) sa queue
    private int rear; // Index sa luyo (rear) sa queue
    private int maxSize; // Maximum nga gidak-on sa queue
    private int currentSize; //Kadaghanon sa mga elemento sa queue

    // Constructor para mag-set up sa queue gamit ang maximum nga gidak-on
    public Queue(int size) {
        maxSize = size; // I-set ang maximum nga gidak-on
        queueArray = new int[maxSize]; // Himoa ang array base sa maxSize
        front = 0; // I-set ang front sa 0
        rear = -1; // I-set ang rear sa -1 kay wala pa'y elemento
        currentSize = 0; // I-set ang currentSize sa 0 kay wala pa'y elemento sa queue
    }

    // Metodo para mag-enqueue (magdugang) og elemento sa queue
    public void enqueue(int value) {
        if (isFull()) { // Kung puno na ang queue
            System.out.println("Queue is Full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize; // I-update ang rear index gamit ang modulo
            queueArray[rear] = value; // Ibutang ang elemento sa queue
            currentSize++; // Dugangi ang currentSize
        }
    }

    // Metodo para mag-dequeue (kuhaon) ang elemento gikan sa queue
    public int dequeue() {
        if (isEmpty()) { // Kung ang queue walay sulod
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Ibalik ang -1 kung empty
        } else {
            int value = queueArray[front]; // Ikuha ang elemento gikan sa front
            front = (front + 1) % maxSize; // I-update ang front index gamit ang modulo
            currentSize--; // Kuhaon ang usa ka elemento gikan sa currentSize
            return value; // Ibalik ang gikuha nga elemento
        }
    }

    // Metodo para tan-awon ang elemento nga naa sa front nga wala mag-dequeue
    public int peek() {
        if (isEmpty()) { // Kung walay sulod ang queue
            System.out.println("Queue is empty.");
            return -1; // Ibalik ang -1 kung empty
        } else {
            return queueArray[front]; // Ibalik ang element nga naa sa front
        }
    }

    // Metodo para pagsusi kung empty ba ang queue
    public boolean isEmpty() {
        return (currentSize == 0); // Mobalik og true kung ang currentSize kay 0
    }

    // Metodo para pagsusi kung puno na ba ang queue
    public boolean isFull() {
        return (currentSize == maxSize); // Mobalik og true kung ang currentSize equal sa maxSize
    }

    // Main nga metodo para pagsulay sa queue operations
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Pag-instansya og Queue nga naay maximum size 5
        queue.enqueue(10); // I-enqueue ang 10
        queue.enqueue(20); // I-enqueue ang 20
        queue.enqueue(30); // I-enqueue ang 30
        queue.enqueue(40); // I-enqueue ang 40
        queue.enqueue(50); // I-enqueue ang 50
        queue.enqueue(60); // Sulayi mag-enqueue og 60 pero puno na

        System.out.println("Front element is: " + queue.peek()); // Ipakita ang elemento sa front
        System.out.println("Dequeued element: " + queue.dequeue()); // Mag-dequeue ug ipakita ang gikuha nga elemento
        System.out.println("Front element after dequeue: " + queue.peek()); // Ipakita ang elemento sa front human ang dequeue
    }
}