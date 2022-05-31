package main;

import java.util.Scanner;

public class Operatori {


    public static void main(String[] args) {

        int x = 10;
        int y = ++x;

        System.out.println("Vrednost x: " + x);
        System.out.println("Vrednost y: " + y);

        int z = 50;
        int e = 60;


        boolean rezultat = x == y && z < e;
        System.out.println(rezultat);

        boolean rezultat2 = (x == y || z > e || e <x) && y < z;
        System.out.println(rezultat2);

        int a = 10;
        int b = 20;

        boolean res = (a == 10 && b++ == 20);
        boolean res2 = !res;
        System.out.println(res);

        // Operatori poredjenja
        // ==
        // !=
        // <
        // >
        // >=
        // <=

        //Logicki operatori
        // && -----> AND
        // || -----> OR
        // ? ternarni operator ------> if else


        Scanner scanner = new Scanner(System.in);

        //korisnik unosi dva broja
        // nakon toga unosi operator
        // ispisati rezultat operacije


    }




}
