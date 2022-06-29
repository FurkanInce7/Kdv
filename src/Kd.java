import java.util.Scanner;
public class Kd {
    public static void main(String[] args) {
        double ucret;

        Scanner inp = new Scanner(System.in);

        System.out.println(" Lutfen Urunun Miktarini Giriniz: ");
        ucret = inp.nextDouble();
        if(ucret<1000 && ucret >0){
          double kdvOran = 0.18;
            double KdvTutar= ucret * kdvOran;
        double kdvliTutar = ucret + KdvTutar;
            System.out.println("KDV'siz Tutar: "+ucret);
            System.out.println("KDV Orani: + "+ kdvOran);
            System.out.println("KDV Tutari: "+ KdvTutar);
            System.out.println("KDV'li Tutar" +kdvliTutar);
        }
        else if( ucret>1000 ){
            double kdvOran2= 0.08;
            double KdvTutar2= ucret * kdvOran2;
            double kdvliTutar2= ucret +KdvTutar2;
            System.out.println("KDV'siz Tutar: "+ucret);
            System.out.println("KDV Orani: + "+ kdvOran2);
            System.out.println("KDV Tutari: "+ KdvTutar2);
            System.out.println("KDV'li Tutar" +kdvliTutar2);

    }
        else {
            System.out.println("Islemleri Kontrol Ediniz...");
        }
}}
