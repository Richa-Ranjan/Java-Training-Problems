// compile time
// class Poly {
//     void show() {
//         System.out.println("This is a show method ");
//     }
//     void show(int a,int b){
//         System.out.println(a+" "+b);
//     }
//     void show(int a,int b,int c){
//         System.out.println(a+" "+b+" "+c+" ");
//     }
//     public static void main(String[] args) {
//         Poly obj=new Poly();
//         obj.show();
//         obj.show(10,20);
//         obj.show(10,20,30);
//     }
// }

// Run Time
class A{
    void show(int a){
        System.out.println(a);
    }
}
class B extends A{
    @Override
    void show(int a){
        super.show(200);
        System.out.println(a);

    }
    public static void main(String[] args) {
        B obj=new B();
        obj.show(100);
    }
}