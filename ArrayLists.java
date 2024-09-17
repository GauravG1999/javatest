/**
 * array--fixed sized--can stored primitive data types and objects
 * arraylist==varied sized--only objects are stored(in heap memory)
 * ArrayLists
 * add(add elements)
 * get(get elements)
 * modify or addinbetween
 * dlete OR remove
 * Iterate or opertions
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        //Integer|String|Float|Boolean
        //Arraylist<DATATYPE>
        ArrayList<Integer> list=new ArrayList<Integer>();
    //    ArrayList<String> list1=new ArrayList<String>();
     //   ArrayList<Boolean> list2=new ArrayList<Boolean>();

     //add method

ArrayList<String> listv=new ArrayList<>();
listv.add("gaurav");
listv.add("vikas");
listv.add("rohan");
listv.add("takssi");
System.out.println(listv);
System.out.println(listv.get(2));


  List<Object> list9 = new ArrayList<>();//we can use mutiple datatype by using Object as a return type

  list9.add("String");      // String
  list9.add(10);            // Integer
  list9.add(3.14);          // Double
  list9.add(true);          // Boolean
		System.out.println(list9);

        System.out.println(list9.get(2));
		

        list.add(7);
        list.add(2);//[7,8,9,5]
        list.add(8);
        System.out.println(list);
//get method
        int element =list.get(1);
        System.out.println(element);

//add in between data
        list.add(1, 5);
        System.out.println(list);

        //set element
        list.add(9);
System.out.println(list);

        list.set(2, 3);
        System.out.println(list);

        //delete

        list.remove(3);
        System.out.println(list);

        int size=list.size();
        System.out.println(size);

        //iteration
//[4,6,8,2]
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);//-----//O(n)

        Collections.max(list);


        System.out.println(list);
    }
}