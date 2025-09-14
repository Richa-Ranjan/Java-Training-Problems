public class checkbit {
    public static void printBinary(int num) {
        for (int i = 10; i >= 0; --i) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinary(9);
        
    }
}
