//java example for pipeline
public class AddTwoNumbers {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Main method to run the application
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Call the test method to verify the logic
        testAdd();
    }

    // Basic Test Method (using assertions)
    public static void testAdd() {
        assert add(1, 2) == 3 : "Test failed: 1 + 2 should be 3";
        assert add(1, -1) == 0 : "Test failed: 1 + (-1) should be 0";
        assert add(3, 4) == 7 : "Test failed: 3 + 4 should be 7";

        System.out.println("All tests passed!");
    }
}
