package Figury;

//        masz 2 figury: trójkąt i romb
//        na wejsciu podajesz dwie albo 3 wartosci (jak dwie to znaczy, że to romb, jak 3 to trójkąt)
//        musisz obliczyć pole i obwód figur na postawie parametrów wejściowych
//        pole trójkąta wzorem herona
//        boki rombu pitagorasem

import java.sql.SQLOutput;
import java.util.Scanner;

public class Figury {

    private int bok1;
    private int bok2;
    private int bok3;
    private double pole;
    private int obwod;

    public Figury(int bok1, int bok2, int bok3)
    {
        //trojkat
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;

        if ((bok1 + bok2 > bok3)||(bok2 + bok3 > bok1)||(bok1 + bok3 > bok2))
        {
            System.out.println("To jest trojkat.");
            System.out.println("Obwod trojkata: " + obwodTrojkata() + "\nPole trojkata: " + poleTrojkata());
        }
        else
            System.out.println("Te odcinki nie utworza trojkata.");
    }

    public Figury(int bok1, int bok2)
    {
        //romb
        this.bok1 = bok1;
        this.bok2 = bok2;
        System.out.println("to jest romb.");
    }

    int obwodTrojkata()
    {
        obwod = bok1 + bok2 + bok3;
        return obwod;
    }

    double poleTrojkata()
    {
        double p;
        p = obwod / 2;
        pole = Math.sqrt(p*(p-bok1)*(p-bok2)*(p-bok3));

        return pole;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Figury figura = new Figury(31,31,13);

    }

    }
