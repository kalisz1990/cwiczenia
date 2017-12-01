package Figury;

//        masz 2 figury: trójkąt i romb
//        na wejsciu podajesz dwie albo 3 wartosci (jak dwie to znaczy, że to romb, jak 3 to trójkąt)
//        musisz obliczyć pole i obwód figur na postawie parametrów wejściowych
//        pole trójkąta wzorem herona
//        boki rombu pitagorasem

import java.util.Scanner;

public class Figury {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Trojkat trojkat = new Trojkat(2,4,6);

        System.out.println("pole trojkata: " + trojkat.poleTrojkata());
        System.out.println("obwod trojkata: " + trojkat.obwodTrojkata());

    }

    static class Trojkat
    {
        private int bok1;
        private int bok2;
        private int bok3;
        private int pole;
        private int obwod;

        public Trojkat(int bok1, int bok2, int bok3)
        {
            this.bok1 = bok1;
            this.bok2 = bok2;
            this.bok3 = bok3;
        }

        int obwodTrojkata()
        {
            obwod = bok1 + bok2 + bok3;
            return obwod;
        }

        int poleTrojkata()
        {
            pole = (bok1 * bok2 * bok3) / 2;

            return pole;
        }
    }
}