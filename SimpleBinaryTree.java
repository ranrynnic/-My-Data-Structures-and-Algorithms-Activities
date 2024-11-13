public class SimpleBinaryTree {
    int value;                    // The value
    
    SimpleBinaryTree left;        // Reference to the left child node
    SimpleBinaryTree right;       // Reference to the right child node

    
    public SimpleBinaryTree(int value) {
        this.value = value;
        left = null;               // Initiallized, there is no left child
        right = null;              // Initiallized, there is no right child
    }

    // Method to insert a new value into the binary search tree
    public void insert(int newValue) {
       
        if (newValue < value) {
            
            if (left == null) {
                left = new SimpleBinaryTree(newValue);
            } else {
                
                left.insert(newValue);
            }
        } 
        // If the new value is larger than the current node's value,
        
        else if (newValue > value) {
            
            if (right == null) {
                right = new SimpleBinaryTree(newValue);
            } else {
                
                right.insert(newValue);
            }
        }
        
    }

    
    public void inOrder() {
        
        if (left != null) {
            left.inOrder();
        }
        
        System.out.print(value + " ");
        
        if (right != null) {
            right.inOrder();
        }
    }

    // Main method of Binary Tree
    public static void main(String[] args) {
       
        SimpleBinaryTree tree = new SimpleBinaryTree(6);

        
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(8);
        tree.insert(6);
        tree.insert(1);

        
        System.out.print("In-order Traversal: ");
        tree.inOrder(); 
        
    }
}
