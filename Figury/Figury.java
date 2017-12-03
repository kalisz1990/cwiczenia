package Figury;

//        masz 2 figury: trójkąt i romb
//        na wejsciu podajesz dwie albo 3 wartosci (jak dwie to znaczy, że to romb (przekatne), jak 3 to trójkąt(boki))
//        musisz obliczyć pole i obwód figur na postawie parametrów wejściowych
//        pole trójkąta wzorem herona
//        boki rombu pitagorasem

import java.sql.SQLOutput;
import java.util.Scanner;

public class Figury {

    private double bok1;
    private double bok2;
    private double bok3;
    private double pole;
    private double obwod;

    public Figury(int bok1, int bok2, int bok3)
    {
        //trojkat
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;

        if ((Math.abs(bok2-bok3)<bok1)&&(bok1<bok2+bok3))
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
        System.out.println("Obwod rombu: " + obwodRombu() + "\nPole rombu: " + poleRombu());
        System.out.println("Bok rombu: "+ bokRombu());

    }
    double obwodRombu()
    {
        obwod = bokRombu()*4;
        return obwod;
    }

    double poleRombu()
    {
        pole = (bok1*bok2)/2;
        return pole;
    }

    double bokRombu()
    {
        double bokRobu;
        bokRobu = Math.sqrt(Math.pow((bok1/2),2) + Math.pow((bok2/2),2));
        return bokRobu;
    }

    double obwodTrojkata()
    {
        obwod = bok1 + bok2 + bok3;
        return obwod;
    }

    double poleTrojkata()
    {
        double p;
        p = obwodTrojkata() / 2;
        pole = Math.sqrt(p*(p-bok1)*(p-bok2)*(p-bok3));
        return pole;
    }


    public static void main(String[] args)
    {
        Figury figura = new Figury(8,6);

    }
}
