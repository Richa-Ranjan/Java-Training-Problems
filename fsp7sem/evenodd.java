public class evenodd {
    
    public static void printBinary(int num) {
        for (int i = 10; i >= 0; --i) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=0; i<=7; i++) {
            printBinary(i);
            System.out.println(i);
            if((i&1) == 1) {
                System.out.println("Odd Number");
            } else {
                System.out.println("Even Number");
            }

        }
    }
}
