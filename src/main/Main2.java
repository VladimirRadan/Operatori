package main;

public class Main2 {

    public static void main(String[] args) {


        String s = "pera"; // ------------------------> @jf45864534

        String s2 = "pera"; // ------------------------>@jf45864534

        String s4 = "pera"; // ------------------------>@jf45864534 //pera
        String s5 = "pera"; // ------------------------>@jf45864534
        String s6 = "pera"; // ------------------------>@jf45864534
        String s7 = "pera"; // ------------------------>@jf45864534

        String s3 = new String("pera"); // heap ------>  string Pool  ------> @fdesf889787

        String s56 = new String("pera");//------> @!!!!!!!!!!5

        System.out.println(s3.equals(s56)); // poredi samo vrednosti
        System.out.println(s3 == s56); // poredi id u memoriji

        String ime = "Gavrilo      ";
        String ime2 = "gavrilo";
        System.out.println(ime.equals(ime2));
        System.out.println(ime.contains(ime2));

        int duzinaImena = ime.length();

        System.out.println(duzinaImena);
        System.out.println(ime.toUpperCase());
        System.out.println(ime.equalsIgnoreCase(ime2));
        System.out.println("Trimed: " + ime.trim());
        System.out.println(ime2.charAt(2));

        String novoIme = ime2.substring(2,5);
        System.out.println(novoIme.toUpperCase());









    }

}
