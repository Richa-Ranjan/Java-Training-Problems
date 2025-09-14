class A {
    int a = 100; // instance variable
    static int b = 200;
}

class B {
    public static void main(String[] args) {
        B obj = new B();
        int c = 300;
        System.out.println(obj.a);
        System.out.println(B.b);
        System.out.println(c);
    }
}
