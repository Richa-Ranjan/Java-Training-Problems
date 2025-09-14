// class A {
//     int a = 100; // instance variable
//     static int b = 200;
// }

// class B extends A {
//     public static void main(String[] args) {
//         B obj = new B();
//         int c = 300;
//         System.out.println(obj.a);
//         System.out.println(B.b);
//         System.out.println(c);
//     }
// }









//muti level inheritance:

// class A {
//     int a=10;
// }

// class B extends A {
//     int b=20;

// }

// class C extends B {
//     int c=30;

// }

// class D extends C {
//     int d=40;
// public static void main(String[] args) {
//     D obj=new D();
//     System.out.println(obj.a);
//     System.out.println(obj.b);
//     System.out.println(obj.c);
//     System.out.println(obj.d);
// }
// }









//hierarchical inheritance:

class Tree{
    void tShow(){
        System.out.println("This is a tree");
    }

    class Human extends Tree{
        void hShow(){
            System.out.println("This is a human");
        } 
    }
    class Bird extends Tree{
        void bShow(){
            System.out.println("class bird");
        }
    }
    class D{
        public static void main(String[] args) {
            Human h = new Tree().new Human();
            Bird b = new Tree().new Bird();
            h.tShow();
            h.hShow();


            
            
        }
    }
}

