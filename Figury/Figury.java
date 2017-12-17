package Figury;

//        masz 2 figury: trójkąt i romb
//        na wejsciu podajesz dwie albo 3 wartosci (jak dwie to znaczy, że to romb (przekatne), jak 3 to trójkąt(boki))
//        musisz obliczyć pole i obwód figur na postawie parametrów wejściowych
//        pole trójkąta wzorem herona
//        boki rombu pitagorasem
//        uzyc interfejsów


import java.util.Scanner;

interface Figura {
    double pole();
    double obwod();

}
interface CzyTrojkat{
    boolean sprawdzenieTrojkata();
}

    class Trojkat implements Figura, CzyTrojkat {

        double bok1;
        double bok2;
        double bok3;
        double poleTrojkata;
        double obwodTrojkata;


        public Trojkat (int bok1, int bok2, int bok3) {
            this.bok1 = bok1;
            this.bok2 = bok2;
            this.bok3 = bok3;

        }
        @Override
        public boolean sprawdzenieTrojkata()
        {
            //sprawdzenie czy z podanych odcinków powstanie trojkat
            if ((Math.abs(bok2 - bok3) < bok1) && (bok1 < bok2 + bok3)) {
                System.out.println("Z podanych wartosci powstanie trojkat.");
            return true;
            }
            else
            {
                System.out.println("Te odcinki nie utworza trojkata.");
            return false;
            }
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
            public double pole()
            {
                poleRombu = (przekatna1 * przekatna2) / 2;
                return poleRombu;
            }
        }

        public class Figury {

            public static void main(String[] args) {

                int bok1 = 0;
                int bok2 = 0;
                int bok3 = 0;
                int przekatna1 = 0;
                int przekatna2 = 0;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj 3 dlugosci boków trojkata: ");
                bok1 = scanner.nextInt();
                bok2 = scanner.nextInt();
                bok3 = scanner.nextInt();

                CzyTrojkat sprawdzanie = new Trojkat(bok1, bok2, bok3);
                Figura trojkat = new Trojkat(bok1, bok2, bok3);
                if (sprawdzanie.sprawdzenieTrojkata()) {
                    System.out.println("pole trojkata: " + trojkat.pole());
                    System.out.println("obwod trojkata: " + trojkat.obwod());
                }
                System.out.println();

                System.out.println("Podaj 2 dlugosci przekątnych dla rombu: ");
                przekatna1 = scanner.nextInt();
                przekatna2 = scanner.nextInt();

                Figura romb = new Romb(przekatna1, przekatna2);
                System.out.println("pole rombu: " + romb.pole());
                System.out.println("obwod rombu: "  + romb.obwod());
            }
        }

