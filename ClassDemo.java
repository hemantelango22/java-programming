class ClassDemo {

    // Data members
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating objects
        ClassDemo obj1 = new ClassDemo();
        ClassDemo obj2 = new ClassDemo();

        // Assigning values
        obj1.name = "Rahul";
        obj1.age = 20;

        obj2.name = "Priya";
        obj2.age = 21;

        // Calling method
        obj1.display();
        obj2.display();
    }
}