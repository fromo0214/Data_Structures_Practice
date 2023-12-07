package Binary_Search_Tree;

public class BinarySearchTree {
    Node root;

    public void insert(Node node){
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){
        int data = node.data;

        if(root == null){
            root = node;
            return root;
        }else if(data < root.data){
            //this makes root node change with recursion
            //this will go to the root node of a sub-tree
            root.left = insertHelper(root.left, node);
            //the child of a root node will then become the 
            //root node for the sub tree 
        }else{
             root.right = insertHelper(root.right, node);
        }
        return root;
    } 

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(Node root){
        if(root != null){
            //this displays the tree in a non decreasing
            //order
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);

        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data){
        if(root == null){
            return false;
        }//this means we found the data we were looking for
        //and found a match
        else if(root.data == data){
            return true;
        }//this means we need to go left
        else if(root.data > data){
            return searchHelper(root.left, data);
        }//this means we go right
        else{
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){
        //if we find the data we are looking for then
        if(search(data)){
            removeHelper(root, data);
        }else{
            System.out.println(data + " could not be found.");
        }
    }

    public Node removeHelper(Node root, int data){
        if(root == null){
            return root;
        }//if the data is less than the root node than we go left in the
        //tree
        else if(data < root.data){
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data){
            root.right = removeHelper(root.right, data);
        }
        else{//node was found
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right != null){// find a successor of the right
                                        //node is not null
                root.data = successor(root);     
                root.right = removeHelper(root.right, root.data);
            }
            else{//finds a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root){//find least value below the right child
                                        //of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root){//find greatest value below the right 
                                        //child of this root node
       root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;    
    }
}
