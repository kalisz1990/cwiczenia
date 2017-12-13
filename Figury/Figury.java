package Figury;

//        masz 2 figury: trójkąt i romb
//        na wejsciu podajesz dwie albo 3 wartosci (jak dwie to znaczy, że to romb (przekatne), jak 3 to trójkąt(boki))
//        musisz obliczyć pole i obwód figur na postawie parametrów wejściowych
//        pole trójkąta wzorem herona
//        boki rombu pitagorasem
//        uzyc interfejsów

import java.sql.SQLOutput;

interface Figura{
    double pole();
    double obwod();
}

    class Trojkat implements Figura {

        double bok1;
        double bok2;
        double bok3;
        double poleTrojkata;
        double obwodTrojkata;


        public Trojkat (int bok1, int bok2, int bok3) {
            this.bok1 = bok1;
            this.bok2 = bok2;
            this.bok3 = bok3;

            //sprawdzenie czy z podanych odcinków powstanie trojkat
            if ((Math.abs(bok2 - bok3) < bok1) && (bok1 < bok2 + bok3))
                System.out.println("To jest trojkat.");

            else
                System.out.println("Te odcinki nie utworza trojkata.");
            }

            @Override
            public double pole() {
                //wzor obliczania pola trojkata metoda Herona
                double p;
                p = obwod() / 2;
                poleTrojkata = Math.sqrt(p * (p - bok1) * (p - bok2) * (p - bok3));
                return poleTrojkata;
            }
            @Override
            public double obwod() {
                obwodTrojkata = bok1 + bok2 + bok3;
                return obwodTrojkata;
            }
        }

        class Romb implements Figura {

            double przekatna1;
            double przekatna2;
            double obwodRombu;
            double poleRombu;

            public Romb(int przekatna1, int przekatna2) {

                this.przekatna1 = przekatna1;
                this.przekatna2 = przekatna2;
            }

            @Override
            public double obwod() {
                double bokRombu;
                //wzor na obliczenie dlugosci boku rombu na podstawie przekątnych
                bokRombu = Math.sqrt(Math.pow((przekatna1 / 2), 2) + Math.pow((przekatna2 / 2), 2));
                obwodRombu = bokRombu * 4;
                return obwodRombu;
            }

            @Override
            public double pole() {
                poleRombu = (przekatna1 * przekatna2) / 2;
                return poleRombu;
            }
        }

        public class Figury
        {

    public static void main(String[] args) {

        Figura trojkat = new Trojkat(3, 4, 5);
        System.out.println("Pole trojkata: " + trojkat.pole());
        System.out.println("Obwod trojkata: " + trojkat.obwod());

        System.out.println();

        Figura romb = new Romb(6,14);
        System.out.println("Pole rombu: " + romb.pole());
        System.out.println("Obwod rombu: " + romb.obwod());

    }
}

