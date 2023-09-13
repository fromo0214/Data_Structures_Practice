import java.util.Stack;
/*Stacks have 5 unique methods, .push() method inputs an item at the bottom
 * of the stack, .pop() method takes an item from the top of a stack, .peek()
 * method peeks at the item at the top of the stack, .empty() method checks if 
 * stack is empty, and the .search(Object o) searches for an item.
 */
/*stack = LIFO data structure, Last-In First-Out 
 * stores objects into a sort of "vertical tower"
 * push() to add to the top
 * pop() to remove from the top
 */

public class StacksTest{
public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    //adding object to the stack by .push()
    stack.push("toothpaste");
    stack.push("toothbrush");
    stack.push("comb");
    stack.push("gel");

    System.out.println(stack);
    //this will remove gel because it is at the top of the stack
    System.out.println(stack.pop());
    System.out.println(stack);
    //searching for something that is not in the stack will return a negative number
    // System.out.println(stack.search("fernando"));
    //searching for an item in the stack will print its index in which it is at
    System.out.println(stack.search("toothpaste"));
    //This String is assigned to a hair item because a "comb" is now the top item at the stack
    String hairItem = stack.pop();

    System.out.println(hairItem);
    
    /* Running this for loop will give us an exception because we will
     * run out of memory
     */

    // for(int i = 0; i < 1000000000; i++){
    //     stack.push("Testing");
    // }
}
}
/* Uses of stacks
1. undo/redo features in text editors
2. moving back/forward through browser history
3. backtracking algorithms (maze, file directories)
4. calling functions (call stack)
*/ 



