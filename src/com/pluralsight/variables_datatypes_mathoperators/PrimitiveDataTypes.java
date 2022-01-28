package com.pluralsight.variables_datatypes_mathoperators;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //Integer Data Types and there range

        System.out.println("Integer Data Types and there range");

        byte b1=127; //2 power 7 to 2 power 7 -1 bit of memory
        byte b2=-128;

        short s1=255; // 2^15-1 to 2^15
        short s2=-254;

        int i1=2147483647; //2^31-1 to 2^31
        int i2=-2147483648;

        long l1=9223372036854775807L; //2^63-1 to 2^63
        long l2=-9223372036854775808L;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("************************************");

        System.out.println("Floating Data Type");

        float f1 = 5.999999f;
        float f2= 35e3f; //35000.0

        double d1=5.99999999999d;
        double d2=12E4d; //120000.0

        System.out.println(f1);
        System.out.println(d1);
        System.out.println(f2);
        System.out.println(d2);

        System.out.println("**************************************");
        System.out.println("Char Data Type");
        char myGrade='B';

        System.out.println(myGrade);

        System.out.println("*************************************");
        System.out.println("Boolean Data Type");
        boolean isJavaFun =true;
        boolean isCrabTasty=false;
        System.out.println(isJavaFun);
        System.out.println(isCrabTasty);




    }
}
