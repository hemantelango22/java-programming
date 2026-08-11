class FunctionDemo {

    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to display a message
    static void display() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {

        // Calling the method
        display();

        int result = add(10, 20);

        System.out.println("Sum = " + result);
    }
}