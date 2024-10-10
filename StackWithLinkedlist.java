class StackNode {
    int data;
    StackNode next;

    // Constructor para sa bag-ong node
    public StackNode(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private StackNode top;

    // Inicialize ang stack nga walay sulod
    public Stack(){
        this.top = null;
    }

    // Metho para mo-push og data sa stack
    public void push(int data){
        StackNode newNode = new StackNode(data); // Himoon ang bag-ong node
        newNode.next = top; // I-link ang bag-ong node ngadto sa previous top
        top = newNode; // I-set ang bag-ong top
        System.out.println(data + " gipush sa stack.");
    }

    // Method para mo-pop og data gikan sa stack
    public int pop(){
        if (isEmpty()){
            System.out.println("Walay sulod ang stack");
            return -1; // Kung empty ang stack, mobalik og -1
        }

        int poppedData = top.data; // Ikuha ang data sa top
        top = top.next; // I-set ang top ngadto sa next node
        return poppedData; // I-return ang gipopped nga data
    }

    // Method para makakuha sa top element
    public int peek(){
        if(isEmpty()){
            System.out.println("Walay sulod ang stack");
            return -1; // Kung empty, mobalik og -1
        }
        return top.data; // I-return ang data sa top node
    }

    // Method para tan-awon kung walay sulod ang stack
    public boolean isEmpty(){
        return (top == null); // True kung ang top null ( if empty)
    }
}

public class StackWithLinkedlist{
    public static void main (String [] args){
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30); // Gipush ang 30 sa stack
    }
}