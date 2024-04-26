package com.oops.introduction;
import java.util.*;

public class Oops{
    public static void main(String[] args) {
        // paramterised constructor uses this keyword when name of the parameter or arguement is same as instance varibale.
        Student vinay = new Student(27,98,"vinay"); // vinay object refrence variable pointing to the object of class student type.
/*
        vinay.roll_no = 27;      // new is keyword that allocates the memory at runtime and return the refrence to it.
        vinay.marks   = 98;
        vinay.name    = "vinay"; // By default these are null and empty values.
*/
        System.out.println(vinay.roll_no);
        System.out.println(vinay.marks);
        System.out.println(vinay.name);
        vinay.greeting();


        Student kaku = new Student();
        System.out.println(kaku.roll_no);
        System.out.println(kaku.marks);
        System.out.println(kaku.name);
        kaku.greeting();
        Student kaku1 = new Student();
        System.out.println(kaku1.roll_no);
        System.out.println(kaku1.marks);
        System.out.println(kaku1.name);


        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students)); // it will print null and it is array of objects of Student type.

        Student kunal = new Student(vinay);
        System.out.println(kunal.roll_no);
        System.out.println(kunal.marks);
        System.out.println(kunal.name);

        final Student one = new Student(); //one is of refrence type(Student)
//      one  = kunal; can not assign value but change the value of members of object or class.
        System.out.println(one.name);
        one.name = "tt";
        System.out.println(one.name);

        A obj = new A("vinay");
        System.out.println(obj.name);

        // If thousands of object being created using a same reference variable and the refrence variable points to the latest objected created.
        // And Java Tweaks the garbage Collector and It destrcut the object on it's own and it does not allow the manually like c++.
       /* A obj2;
        for(int i = 1; i <= 1000000;i++){
            obj2 = new A("Random Name");
        }*/
        // You can not free the memory on its own, you can only do that what to do when the object is destroyed.
        // You can give the some conditions to java to show this when the java decided to destroyed the Object.
        // The reference variable points to the latest object and the object which is not pointed and it increases to certain extent , java destroyed these object itself.
        A obj3 = new A("kaku");
        System.out.println(obj3); // It prints some hashvalue

        Student kavi = new Student();
        kavi.roll_no = 27;
        System.out.println(kavi.roll_no);


    }
}
    class Student{
        // the variables inside the class are know as instace varibales.
        int roll_no;
        float marks;
        String name;

        // Constructor is a special type of function that is used to create the object.
        // it has return type of class type and the name is not there.
        void greeting(){
            System.out.println("Hello My Name is " + this.name); // we can use this or not both will work
        }

        Student(){    // when object is created with non-parameterised constructor and this keyword is optional
                     // Calling Constructor inside the Constructor
            this(23,45,"ff"); // Internally this is replaced by Student

        }
        Student(int rollno_ , float marks_ , String name_){ // When object is created using parameterised constructor
            // this is a keyword that access the object inside the class.
            // this keyword replaced by the name of object of that class. and this keyword is mandatory when varibales names are same.
            System.out.println("Constructor Called Off");
            roll_no = rollno_;
            marks = marks_;
            name = name_;
        }
        Student(Student other){
            this.name = other.name;
            this.marks = other.marks;
            this.roll_no = other.roll_no;
        }
        // Con -structor Overloading> There are Multiple Constructors.


    }

    class A{

        // there is
        String name;
        A(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Constructor is Destroyed");
        }
    }
