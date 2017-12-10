package Figury;

//        masz 2 figury: trójkąt i romb
//        na wejsciu podajesz dwie albo 3 wartosci (jak dwie to znaczy, że to romb (przekatne), jak 3 to trójkąt(boki))
//        musisz obliczyć pole i obwód figur na postawie parametrów wejściowych
//        pole trójkąta wzorem herona
//        boki rombu pitagorasem

import java.sql.SQLOutput;

public class Figury {

    double bok1;
    double bok2;
    double bok3;
    double przekatna1;
    double przekatna2;
    double pole;
    double obwod;

    public Figury (int bok1, int bok2, int bok3){
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }

    public Figury (int przekatna1, int przekatna2) {
        this.przekatna1 = przekatna1;
        this.przekatna2 = przekatna2;
    }

    public static void main (String [] args)

    {
        Trojkat trojkat = new Trojkat(3,4,5);
        System.out.println(trojkat.obwod());
        System.out.println(trojkat.pole());
        System.out.println();

        Romb romb = new Romb(3,4);
        System.out.println(romb.pole());
        System.out.println(romb.bokRombu());
    }
}

class Trojkat extends Figury {

    public Trojkat(int bok1, int bok2, int bok3) {
        super(bok1, bok2, bok3);

        if ((Math.abs(bok2-bok3)<bok1)&&(bok1<bok2+bok3))
        {
            System.out.println("To jest trojkat.");
        }
        else
            System.out.println("Te odcinki nie utworza trojkata.");
    }

    double obwod() {
        obwod = bok1 + bok2 + bok3;
        return obwod;
    }

    double pole() {
        double p;
        p = obwod() / 2;
        pole = Math.sqrt(p * (p - bok1) * (p - bok2) * (p - bok3));
        return pole;
    }
}

class Romb extends Figury {

    public Romb(int przekatna1, int przekatna2) {
        super(przekatna1, przekatna2);
    }
    double pole()
    {
        pole = (przekatna1 * przekatna2) / 2;
        return pole;
    }

    double bokRombu ()
    {
        double bokRobu;
        bokRobu = Math.sqrt(Math.pow((bok1 / 2), 2) + Math.pow((bok2 / 2), 2));
        return bokRobu;
    }
}