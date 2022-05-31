package main;


import java.io.Console;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //globalne promenljive
    int a = 15;

    public static void main(String args[]) {

        byte b = 127; //2^7
        Byte b2 = 5;



        short s = -129;//2^15
        Short s2 = 456;
        int i = 445864658; //2^31 //4bytes
        long l = 498744986886455L;
        float f = 45.25f;// 4 bytes
        double d = 858.45; //8 bytes
        boolean bull = false; // 1 byte
        Boolean bull2 = true;
        char c = 'A'; // 2 bytes  \u0000
        int x = 10;
        int y = 010;
        int z = 0x10;
        int e = 0b10;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(e);

        int r = 10;
        double d2 = r;
        //System.out.println(d2);

        double d3 = 10.95;
        int r2 = (int)d3;
        //System.out.println(r2);

        int x1, x2, x3;
        x1 = x2 = x3 = 100;
        String x10 = "50";
        int x4 = x1 + x2;
        int neparanBroj = 60;
        System.out.println(neparanBroj%2);
        boolean moduloOperator = neparanBroj%3 == 0;

        System.out.println(moduloOperator);
        System.out.println(x1/2);

        boolean daLiJetacno = !true;
        System.out.println(daLiJetacno);








    }


}//end class


