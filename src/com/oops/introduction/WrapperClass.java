package com.oops.introduction;

public class WrapperClass {
    public static void main(String[] args) {
        final int b3;// In function it can be declared without intialization;
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" , "+b ); // In Java there is only Pass by Value

//        Integer num = 45;
          Integer num = 45; // objects are stored in the Heaps and the reference variable are stored in the stack pointing from stack to heap
          // We will not use the new keyword in case of primitive datatype
        Integer a1 = 78;
        Integer b1 = 75;
        swap1(a1,b1);
        System.out.println(a1 +" , "+b1); // In Java there is only Pass by Value it is still non-swapped.(Final Wrapper Class)

    }
    public static void swap(int a , int b){ // a and b is limited to this scope only
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap1(Integer a , Integer b){ // a and b is limited to this scope only
        Integer temp = a;
        a = b;
        b = temp;
    }

    public void finalKeyword(){
        final int a = 10;
//      a = 78; // Can not assign a value;
        final int b;
        // Final Guarantees the immutability Only when -> If it is primitive Datatype.
        // If it is Object of refrence type.

    }
}
class S{
//    final int b; It must be initialized with declaration
      final int a = 90;
      // If it is not primitive datatype.

}
