public class AddTwoNumbers {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Main method to run the application and test cases
    public static void main(String[] args) {
        // Running the program
        int num1 = 5;
        int num2 = 10;
        int sum = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Running tests inside the same file
        testAdd();
    }

    // Method to test the addition function
    public static void testAdd() {
        boolean allTestsPassed = true;

        if (add(1, 2) != 3) {
            System.out.println("Test Failed: 1 + 2 should be 3");
            allTestsPassed = false;
        }
        if (add(1, -1) != 0) {
            System.out.println("Test Failed: 1 + (-1) should be 0");
            allTestsPassed = false;
        }
        if (add(3, 4) != 7) {
            System.out.println("Test Failed: 3 + 4 should be 7");
            allTestsPassed = false;
        }

        if (allTestsPassed) {
            System.out.println("All tests passed successfully!");
        } else {
            System.exit(1);  // Exit with error if any test fails
        }
    }
}
