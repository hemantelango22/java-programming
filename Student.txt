class Student {
    int age;

    // Constructor
    Student() {
        age = 20;
    }

    void display() {
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();  // Constructor is called automatically
        s.display();
    }
}