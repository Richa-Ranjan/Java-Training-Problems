import java.util.*;

public class factorial {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int fact1=1;
    for(int i=1;i<=n;i++){
            fact1=fact1*i;
    }
    int fact2=1;
    for(int i=1;i<=r;i++){
        fact2=fact2*i;}

        int fact3=1;
        for(int i=1;i<=(n-r);i++){
            fact3=fact3*i;
}
int result=fact1/(fact2*fact3);
System.out.println(result);
}
}