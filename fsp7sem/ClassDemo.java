public class ClassDemo {
    int a = 10;
    void show(){//if we call without object it will give error
        System.out.println(a);
    }

    public static void main(String[] args) {
        ClassDemo obj= new ClassDemo();
        obj.show(); // Calling the instance method using the object
    }
    
}



//constructor is a special method that is called when an object is created and whose name is same as class name