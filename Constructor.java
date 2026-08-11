class Constructor {
    int age;

    // Constructor
    Constructor() {
        age = 20;
    }

    void display() {
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();  // Constructor is called automatically
        c.display();
    }
}