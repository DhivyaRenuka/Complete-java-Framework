package com.DhivyaRenuka;
import java.util.*;

public class Array_class {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9,10};
        // binarysearch direct fn implementation
        int index=Arrays.binarySearch(number ,4);
        System.out.println("the index of element 4 in the array "+index);
        // sort fn in array
        int[] numbers={23,45,32,11,23,14,15,54};
        Arrays.sort(numbers);
        for(int i :numbers){
            System.out.println(i);
        }
        Arrays.fill(numbers,12);
        for(int i :numbers){
            System.out.println(i);
        }
        /*
        collection class have min , max , frequency
         */
        List<Integer> l =new ArrayList<>();
        l.add(12);
        l.add(15);
        l.add(30);
        l.add(90);
        System.out.println(Collections.min(l));
        System.out.println(Collections.max(l));
        System.out.println(Collections.frequency(l,90));
       Collections.sort(l, Comparator.reverseOrder());
        System.out.println(l);


    }
}
