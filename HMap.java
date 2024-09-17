import java.util.HashMap;
import java.util.Map;

/**
 * HMap
 */
public class HMap {
//HasMap unordered  
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //insert
        map.put("India", 150);
        map.put("china", 120);
        map.put("US", 50);

        HashMap<String,Integer> map1=new HashMap<>();
        map1.putAll(map);//putall can give datafrom one object to other in MAP
        System.out.println(map1);

        System.out.println(map);
        map.put("china",180);//it will update in existed key or add if not exist
        System.out.println(map);
        //search 
        if(map.containsKey("India")){
            System.out.println("he he india h mene dekha h");
        }else{
            System.out.println("ni h bhai sorry fir kabhi dhundna");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("indonasia"));

        
int arr[]={12,14,16};

for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();


for(int val : arr){
    System.out.print(val+" ");
}


System.out.println();
//map.entrySet->converted map to set
//Map.Entry<String,Integer>->datatype

for(Map.Entry<String,Integer> e: map.entrySet()){
    System.out.print(e.getKey()+" ");
    System.out.println(e.getValue());
}


    }

}