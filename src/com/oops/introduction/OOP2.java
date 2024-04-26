package com.oops.introduction;
class OOP2{
    public static void main(String[] args) {
        A1 obj = new A1("vinay");
        System.out.println(obj);
    }
}
class A1{
    String name;
    A1(String name_){
        name = name_;
    }

}