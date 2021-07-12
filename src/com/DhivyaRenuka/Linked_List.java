package com.DhivyaRenuka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List
{

    public static void main(String[] args) {
        List<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        list.add(2,5);
        System.out.println(list);

        List<Integer> n_list =new LinkedList<Integer>();
        n_list.add(234);
        n_list.add(24);
        n_list.add(204);
        list.addAll(n_list);
        System.out.println(list);
// getting elemts from list
        for(int vali : list) {
            System.out.println(vali);
        }
        System.out.println("printing by get fn");
        for (int i =0; i<=7;i++){
            System.out.println(list.get(i));
        }
        // remove val from list
        System.out.println(list.remove(1));
        System.out.println(list.remove(Integer.valueOf(234)));
        System.out.println(list);

        // clear complete list
        list.clear();
        System.out.println(list);
        // contain check whether the elem is contain in list or not
        System.out.println(n_list.contains(45));

        /*
        O n time complexity for insertion and deletion  of elem in perticular index
         */

        // set value for particular index

        n_list.set(1,45);
        System.out.println(n_list);


//for(int j=0;j<=n_list.size(); j++){
//    System.out.println("n_list value is : "+n_list.get(j));
//}
// iterator
        Iterator<Integer> it =n_list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator value is "+it.next() );
        }
    }
}
