// class ConstructorDemo {

//      ConstructorDemo() {
//         int a =100;
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         ConstructorDemo obj = new ConstructorDemo(); 
//     }
    
// }










//default constructor:

// class ConstructorDemo {
//     int age;
//     String name;
//     double salary;
//     boolean variable;

//     public ConstructorDemo() {
//         System.out.println(age+" " + name + " " + salary + " " + variable);
//     }
//     public static void main(String[] args) {
//         ConstructorDemo obj = new ConstructorDemo(); 
//     }
    
// }





//paramized constructor:

// class ConstructorDemo {

//     ConstructorDemo(int a) {
//         System.out.println(a);
//     }

//     ConstructorDemo(int b, String s) {
//         System.out.println(b + " " + s);
//     }

//     ConstructorDemo(Double d) {
//         System.out.println(d);
//     }

//     public static void main(String[] args) {
//         ConstructorDemo obj1 = new ConstructorDemo(150); 
//         ConstructorDemo obj2 = new ConstructorDemo(200, "Richa"); 
//         ConstructorDemo obj3 = new ConstructorDemo(99.99); 
//     }
// }







//copy constructor:

class ConstructorDemo{
    int a;
    int b;
    ConstructorDemo(int x, int y) {
        a = x;
        b = y;
    }
     ConstructorDemo(ConstructorDemo ref) {
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo(10, 20); 
        ConstructorDemo obj2 = new ConstructorDemo(obj1); // Copy constructor called
    
    }
    
}