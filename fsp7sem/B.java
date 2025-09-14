abstract class AbstractClass {
    public abstract void Show();
    public abstract void display();

    void show2() {
       
    }
}

abstract class A extends AbstractClass {
    @Override
    public void Show() {
        System.out.println("The abstract method show");
    }

    @Override
    public void display() {
        System.out.println("This is abstract method display");
    }
}

public class B extends A {
    @Override
    public void display() {
        System.out.println("This is overridden display method in class B");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.Show();       // From class A
        obj.display();    // Overridden in B
        obj.show2();      // Concrete method from AbstractClass
    }
}
