package com.DhivyaRenuka;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
//        String [] stud_name = new String[30];
//        stud_name[0]="divya";
//        stud_name[1]="kavya";
//        stud_name[2]="akshya";
//        //  3-27 notes contents
//        stud_name[28]="Navya";
//        stud_name[29]="priya";
//        // new student
//        stud_name[30]="pregya"; // after adding this array show index out of bound
//        // arraylist class make inc and dec optimize other han using array
        ArrayList<String> studentsName =new ArrayList<>();
        studentsName.add("divya");
        studentsName.add("priya");
        studentsName.add("pregya");
        /*
        size of the array will increase automatically when new elements are added to it
        size will become  =n
        n +n/2 +1
         */
        System.out.println(studentsName);





    }
}
