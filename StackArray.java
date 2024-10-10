public class StackArray{
	private int[] stackArray;
	private int top;
	private int maxSize;

	public StackArray(int size){
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1; // Inicialize ang top sa -1 kay walay sulod ang stack
	}

	// Method para mo-push og value sa stack
	public void push(int value){
		if(isFull()){
			System.out.println("Puno na ang stack. Dili na maka-push" + value);
		}
		else{
			stackArray[++top] = value; // I-push ang value sa ibabaw sa stack
		}
	}

	// Method para mo-pop og value gikan sa stack
	public int pop(){
		if(isEmpty()){
			System.out.println("Walay sulod ang stack. Dili maka-pop.");
			return -1;
		}
		else{
			return stackArray[top--]; // Kuhaa ang top value ug i-decrease ang top
		}
	}

	// Pagkuha sa top element
	public int peek(){
		if(isEmpty()){
			System.out.println("Walay sulod ang stack.");
			return -1;
		}
		else{
			return stackArray[top]; // I-return ang top value
		}
	}

	// Method para tan-awon kung walay sulod ang stack
	public boolean isEmpty(){
		return(top == -1);
	}

	// Method para tan-awon kung puno na ang stack
	public boolean isFull(){
		return( top == maxSize-1);
	}

	public static void main(String[] args){
		StackArray stack = new StackArray(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50); // Diri puno na ang stack
		stack.push(60); // Dili na maka-push kay puno na

		System.out.println("Ang top nga elemento kay: " + stack.peek());
		System.out.println("Gipang-pop nga elemento: " + stack.pop());
		System.out.println("Ang top nga elemento human ang pop: " + stack.peek());
	}
}