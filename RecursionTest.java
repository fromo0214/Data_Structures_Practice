/* recursion = When a thing is defined in terms of itself.
                Apply the result of a procedure, to a procedure.
                A recursive method calls itself. Can be a substitute for iteration.
                Divide a problem into sub-problems of the same type as the original.
                Commonly used with advanced sorting algorithms and navigating 
                trees.
 *              
 *              Advantages: 
 *              easier to read/write
 *              easier to debug
 * 
 *              Disadantages:
 *              Sometimes slower
 *              uses more memory
 */

public class RecursionTest {
    public static void main(String[] args) {
        //iteration
        // walkIteratively(5);
        //recursion
        // walkRecursively(10);

        //method to find the factorial of a number
        int value = 9;
        System.out.println("The sum of "+value+"! is: "+factorial(value));

        //recursive method that finds a base brace to a given power
        System.out.println(power(8, 2));
    }

    private static int power(int base, int exponent) {
        if(exponent < 1){
            return 1; //base case
        }
        return base * power(base,exponent - 1);

    }

    private static int factorial(int value) {
        if(value < 1){
            return 1; //base case
        }
        return value * factorial(value - 1); //recursive

    }

    private static void walkRecursively(int steps) {
        if(steps < 1){ //this is a base case
            
            return;
        }
        System.out.println("You take a step!");
        walkRecursively(steps - 1);
    }

    private static void walkIteratively(int steps) {
        for(int i = 0; i < steps;i++){
            System.out.println("You take a step");
        }
    }
    
}
