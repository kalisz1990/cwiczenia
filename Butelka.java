import java.util.Random;

public class Butelka {
   private double ileLitrow;
    private double pojemnosc;

    Butelka(){
    }

    Butelka(double ileLitrow, double pojemnosc)
    {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }

    //asdasdasd

    double getIleLitrow()
    {
        return ileLitrow;
    }

    void wlej(double ilosc) {
        if ((ileLitrow + ilosc) > pojemnosc)
        {
            System.out.println("za mala pojemnosc");
            //this.ileLitrow = pojemnosc;
        }
    else if (ilosc<0)
            System.out.println("nic nie wlales");

        else
        this.ileLitrow += ilosc;
    }

    boolean wylej (double ilosc)
    {
        if (ilosc < ileLitrow)
        this.ileLitrow -= ilosc;
        else
            return false;
        return true;
    }

    void przelej (double ilosc, Butelka gdziePrzelac)
    {
        if (this.wylej(ilosc))
        gdziePrzelac.wylej(ilosc);
        else
            System.out.println("za malo");
    }



     public static void main (String [] args){

        Butelka[] butelka = new Butelka[50];

        for (int i = 0; i<50; i++) {
            butelka[i] = new Butelka((10), 15);
            //System.out.println("ile wlane " + butelka[i].getIleLitrow() + ", pojemnosc " + butelka[i].pojemnosc);
        }
        butelka[11].wlej(1);
        butelka[11].wylej(5);
        butelka[11].przelej(1, butelka[32]);
        butelka[24].wylej(2);
        butelka[23].wlej(3);

        System.out.println(butelka[11].getIleLitrow());
        System.out.println(butelka[32].getIleLitrow());
        System.out.println(butelka[24].getIleLitrow());
        System.out.println(butelka[23].getIleLitrow());



    }
}
