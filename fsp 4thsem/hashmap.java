import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        ///display hashmap
        map.put(1,"ABC");
        map.put(2,"XYZ");
        map.put(3, "PQR");
        //map.clear();
        //map.remove(2);


        // if(map.containsKey(12)){
        //     System.out.println("map contain the key");
        // }
        // else{
        //     System.out.println("map doesnot contain the key");
        // }



        // String answer=map.get(1);
        // System.out.println(answer);


        for(Map.Entry m:map.entrySet())
        {
            System.out.println("key is " +m.getKey()+"value is"+m.getKey());
        }

    }
    
}
