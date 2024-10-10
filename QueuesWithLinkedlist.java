class Node {
    int data; // Ang data nga gicontain sa node
    Node next; // Ang sunod nga node sa linked list

    public Node(int data) {
        this.data = data; // I-set ang data sa node
        this.next = null; // I-set ang next nga node sa null (walay sunod nga node)
    }
}

class Queue {
    private Node front, rear; // Mga reference sa front ug rear nga nodes

    // Constructor para mag-initialize sa queue
    public Queue() {
        this.front = this.rear = null; // I-set ang front ug rear nga walay sulod (null)
    }

    // Method para mag-enqueue (magdugang og element sa queue)
    public void enqueue(int data) {
        Node newNode = new Node(data); 
        if (this.rear == null) { // Kung ang queue walay sulod
            this.front = this.rear = newNode; 
            System.out.println(data + " enqueued to queue");
            return;
        }
        this.rear.next = newNode; // I-link ang bag-ong node sa rear
        this.rear = newNode; // I-update ang rear nga mao ang bag-ong node
    }

    // Method para mag-dequeue (kuhaon ang element gikan sa front sa queue)
    public void dequeue() {
        if (this.front == null) { // Kung walay sulod ang queue
            System.out.println("Queue is empty"); // Ipakita nga walay sulod ang queue
            return;
        }

        int dequeuedValue = this.front.data; // Ikuha ang value sa front nga element
        this.front = this.front.next; // I-update ang front nga mao na ang sunod nga node

        if (this.front == null) { // Kung walay sunod nga node, i-set ang rear sa null
            this.rear = null;
        }
        System.out.println(dequeuedValue + " dequeued from queue"); // Ipakita nga gi-dequeue ang element
    }

    // Metodo para tan-awon (peek) ang element sa front
    public int peek() {
        if (this.front == null) { // Kung walay sulod ang queue
            System.out.println("Queue is empty"); // Ipakita nga empty ang queue
            return -1; // Ibalik ang -1 kung walay sulod
        }
        return this.front.data; // Ibalik ang data sa front
    }

    // Method para pagsusi kung ang queue kay empty (walay sulod)
    public boolean isEmpty() {
        return this.front == null; // Mobalik og true kung ang front kay null (walay sulod)
    }

    // Method para ipakita ang mga element sa queue
    public void printQueue() {
        if (this.front == null) { // Kung walay sulod ang queue
            System.out.println("Queue is empty"); // Ipakita nga empty ang queue
            return;
        }
        Node current = front; // I-set ang current node gikan sa front
        System.out.print("Queue: "); // Output para sa queue
        while (current != null) { // I-loop hangtod ang current kay dili null
            System.out.print(current.data + " "); // Ipakita ang data sa matag node
            current = current.next; // Ipadayon ngadto sa sunod nga node
        }
        System.out.println();
    }
}

public class QueuesWithLinkedlist {
    public static void main(String[] args) {
        Queue queue = new Queue(); // Himoa ang usa ka bag-ong queue

        queue.enqueue(10); // I-enqueue ang 10
        queue.enqueue(20); // I-enqueue ang 20
        queue.enqueue(30); // I-enqueue ang 30
        queue.printQueue(); // Ipakita ang mga element sa queue

        System.out.println("Front element is " + queue.peek()); // Ipakita ang element sa front

        queue.dequeue(); // I-dequeue ang usa ka element
        queue.dequeue(); // I-dequeue pag-usab ang usa ka element
        queue.enqueue(100); // I-enqueue ang 100

        queue.printQueue(); // Ipakita pag-usab ang mga element sa queue
        System.out.println("Front element is " + queue.peek()); // Ipakita ang elemento sa front
    }
}
