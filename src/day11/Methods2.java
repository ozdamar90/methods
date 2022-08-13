package day11;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
        System.out.println("5 Tek mi?"+tekMi(5));
        System.out.println("8 Tek mi?"+ tekMi(8));

        Scanner input=new Scanner(System.in);
        System.out.println("Doğum Yılınız : ");
        int dYil=input.nextInt();
        int aYil= LocalDateTime.now().getYear();
        System.out.print("Senin Yaşın ="+yasHesapla(dYil,aYil));

    }
    //Bir Sayının Tek Olup Olmadığını Test Eden Bir Metot Yazınız.
    public static boolean tekMi(int sayi){
        boolean result=sayi%2==1;
        return result;
    }
    //Kişinin kaç yaşında olduğunu hesaplayan metot yazınız.
    public static int yasHesapla(int dogumYılı, int yıl){
    int yas=yıl-dogumYılı;
    return yas;
    }
}
