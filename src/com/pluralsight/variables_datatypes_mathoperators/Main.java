package com.pluralsight.variables_datatypes_mathoperators;

public class Main {
    public static void main(String[] args) {
        //Using Variables
        int myVar;
        //I am assigng a value;
        myVar=50;
        System.out.println(myVar); // if i print without assigning java: variable myVar might not have been initialized
        int anotherVar=100;
        System.out.println(anotherVar);
        //we can change variable values after initializing

        myVar=anotherVar;
        System.out.println(myVar+" after assigning another var");
        anotherVar=200;
        System.out.println(anotherVar+" Changed Another Var ");



    }
}
