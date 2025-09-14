 //inside abstract class we can implement abstract method as well as non abstract metgod but in interface we can only declare abstract method
interface A{
    void show();  //abstract+public
}

interface B{
    void display();
}

class C implements A,B{
    @Override
   public void show(){
    System.out.println("This is show method from interface A");

   }

   @Override
   public void display(){
    System.out.println("This is display method from interface B");

   }

   public static void main(String[] args) {
       A obj =new C();
       obj.show();
       obj.display(); 
   }
}
