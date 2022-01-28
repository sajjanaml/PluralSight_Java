package com.pluralsight.variables_datatypes_mathoperators;

public class CompoundAssignment {
    public static void main(String[] args) {
        int f =100;
        int v1=19;
        int v2=29;
        System.out.println(++v1);
        System.out.println(++v2);
        f/=v1+v2;
        System.out.println(f);
        v2/=v1;
        System.out.println(v2);


    }
}
