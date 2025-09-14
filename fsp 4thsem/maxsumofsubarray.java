public class maxsumofsubarray {
            public static void main(String[] args) {
                int arr[]={2,-3,6,-5,4,1};
                int ps=Integer.MIN_VALUE;
                int index1=-1;
                int index2=-1;
                for(int i=0;i<5;i++){
                    int sum=0;
                    for(int j=i;j<5;j++){
                        sum=sum+arr[j];
                        if(sum>ps){
                            index1=i;
                            index2=j;
                            ps=sum;
                        }
                    }

                    System.out.println(ps);
                    System.out.println(index1);

                }
                System.out.println(index2);
            }
        }
    
