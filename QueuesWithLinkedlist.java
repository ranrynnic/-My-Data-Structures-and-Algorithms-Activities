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

    // Metodo para mag-enqueue (magdugang og elemento sa queue)
    public void enqueue(int data) {
        Node newNode = new Node(data); // Maghimo og bag-ong node nga mag-contain sa data
        if (this.rear == null) { // Kung ang queue walay sulod
            this.front = this.rear = newNode; // I-set ang front ug rear nga mao ra ang bag-ong node
            System.out.println(data + " enqueued to queue"); // Ipakita nga gi-enqueue ang elemento
            return;
        }
        this.rear.next = newNode; // I-link ang bag-ong node sa rear
        this.rear = newNode; // I-update ang rear nga mao ang bag-ong node
    }

    // Metodo para mag-dequeue (kuhaon ang elemento gikan sa front sa queue)
    public void dequeue() {
        if (this.front == null) { // Kung walay sulod ang queue
            System.out.println("Queue is empty"); // Ipakita nga walay sulod ang queue
            return;
        }

        int dequeuedValue = this.front.data; // Ikuha ang value sa front nga elemento
        this.front = this.front.next; // I-update ang front nga mao na ang sunod nga node

        if (this.front == null) { // Kung walay sunod nga node, i-set ang rear sa null
            this.rear = null;
        }
        System.out.println(dequeuedValue + " dequeued from queue"); // Ipakita nga gi-dequeue ang elemento
    }

    // Metodo para tan-awon (peek) ang elemento sa front
    public int peek() {
        if (this.front == null) { // Kung walay sulod ang queue
            System.out.println("Queue is empty"); // Ipakita nga empty ang queue
            return -1; // Ibalik ang -1 kung walay sulod
        }
        return this.front.data; // Ibalik ang data sa front
    }

    // Metodo para pagsusi kung ang queue kay empty (walay sulod)
    public boolean isEmpty() {
        return this.front == null; // Mobalik og true kung ang front kay null (walay sulod)
    }

    // Metodo para ipakita ang mga elemento sa queue
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
        queue.printQueue(); // Ipakita ang mga elemento sa queue

        System.out.println("Front element is " + queue.peek()); // Ipakita ang elemento sa front

        queue.dequeue(); // I-dequeue ang usa ka elemento
        queue.dequeue(); // I-dequeue pag-usab ang usa ka elemento
        queue.enqueue(100); // I-enqueue ang 100

        queue.printQueue(); // Ipakita pag-usab ang mga elemento sa queue
        System.out.println("Front element is " + queue.peek()); // Ipakita ang elemento sa front
    }
}