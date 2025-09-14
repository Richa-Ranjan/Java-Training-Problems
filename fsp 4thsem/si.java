import java.util.*;

public class si {
    public static void main(String[] args) {
        // int p=1000;
        // int r=10;
        // int t=2;
        // int si=(p*r*t)/100;

        // float a =12;
        // float b = 7;
        // float c= 13;
        //  float s = (a+b+c)/2;
        // double area= Math.sqrt(s*(s - a)*(s - b)*(s - c));
        // System.out.println("area of triangle is:"+area);

        //calculate the sum of n natural number
        Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
        // int sum = n*(n-1)/2;
        // {
        //     System.out.println(sum);
        // }



        //calculate the sum of squar eof n natural number

        int sumofsquare = n*(n+1)*(2*n+1)/6;
          System.out.println(sumofsquare);
        

    }
    
}
