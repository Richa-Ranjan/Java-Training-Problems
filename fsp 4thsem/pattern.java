public class pattern {
    public static void main(String[] args) {
        //int k;
        //int n;
        //Scanner sc = new Scanner(System.in);

        // int k=1;
        
        //     for(int i= 1;i<=4;i++)
        //     {
        //         for(int j=1;j<=i;j++)
        //         {
        //         System.out.print(k++  +" ");
        //         }
        //         System.out.println();
        //     }

        for(int i=1;i<=5;i++){
            for(int j= 1;j<=i;j++){
                if((i+j)% 2== 0)
                System.out.print("1"+"");
                else
                System.out.print("0");
            }
            System.out.println(" ");
        }
        
    }
    
}
