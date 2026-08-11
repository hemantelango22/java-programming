class AccessDemo {

    private int a = 10;
    int b = 20;              // default
    protected int c = 30;
    public int d = 40;

    void display() {
        System.out.println("Private: " + a);
        System.out.println("Default: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Public: " + d);
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        obj.display();

        System.out.println("Public value: " + obj.d);
    }
}