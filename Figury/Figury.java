package Figury;

//        masz 2 figury: trójkąt i romb
//        na wejsciu podajesz dwie albo 3 wartosci (jak dwie to znaczy, że to romb (przekatne), jak 3 to trójkąt(boki))
//        musisz obliczyć pole i obwód figur na postawie parametrów wejściowych
//        pole trójkąta wzorem herona
//        boki rombu pitagorasem
//        uzyc interfejsów

import java.sql.SQLOutput;

interface Trojkat
{
    double poleTrojkata();
    double obwodTrojkata();
}
interface Romb
{
    double obwodRombu();
    double poleRombu();
}

public class Figury implements Trojkat, Romb {

    double bok1;
    double bok2;
    double bok3;
    double przekatna1;
    double przekatna2;
    double poleTrojkata;
    double obwodTrojkata;
    double obwodRombu;
    double poleRombu;

    public Figury(int bok1, int bok2, int bok3) {
        //Trojkat
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;

        if ((Math.abs(bok2 - bok3) < bok1) && (bok1 < bok2 + bok3)) {
            System.out.println("To jest trojkat.");
        } else
            System.out.println("Te odcinki nie utworza trojkata.");
    }

    public Figury(int przekatna1, int przekatna2) {
        //Romb

        this.przekatna1 = przekatna1;
        this.przekatna2 = przekatna2;
    }

    public static void main(String[] args) {

        Figury trojkat = new Figury(3, 4, 5);
        System.out.println("Pole trojkata: " + trojkat.poleTrojkata());
        System.out.println("Obwod trojkata: " + trojkat.obwodTrojkata());

        System.out.println();

        Figury romb = new Figury(3, 4);
        System.out.println("Pole rombu: " + romb.poleRombu());
        System.out.println("Obwod rombu: " + romb.obwodRombu());

    }

    @Override
    public double poleTrojkata() {
        double p;
        p = obwodTrojkata() / 2;
        poleTrojkata = Math.sqrt(p * (p - bok1) * (p - bok2) * (p - bok3));
        return poleTrojkata;
    }

    @Override
    public double obwodTrojkata() {
        obwodTrojkata = bok1 + bok2 + bok3;
        return obwodTrojkata;
    }
    @Override
    public double obwodRombu() {
        double bokRombu;
        bokRombu = Math.sqrt(Math.pow((przekatna1 / 2), 2) + Math.pow((przekatna2 / 2), 2));
        obwodRombu = bokRombu*4;
        return obwodRombu;
    }

     @Override
    public double poleRombu() {
        poleRombu = (przekatna1 * przekatna2) / 2;
        return poleRombu;
    }

}
