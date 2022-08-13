package day10;

public class KisaTekrar {
    public static void main(String[] args) {
        //Değişken Tanımlama
        //Resmi-Gatrı Resmi Kurallar
        //Notasyonlar:Camel,Pascal,Snake;
        //Sınıf Tanımlamaları Pascal,
        //değişken ve Metot tanımlamaları Camel,
        //Constant için Snake Örn:PI_SAYISI
        int birinciSayi=5;
        //Operatörler:
        // Aritmatik:+,-,*,/,%
        //Relational Operators: ==,!=,<,>,<=,>=,
        //Logical Ops: &,|,!
        int ikiknciSayi=7;
        if (birinciSayi>ikiknciSayi&ikiknciSayi>=0){
            System.out.println("İşlem Geçerli)");

        }else{
            System.out.println("Geçersizdir.");
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println((i+1)+". Merhaba");
            for (int j = 0; j <5 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
/*
        int sayac=1;
        int toplam=0;
        while (sayac<5){
            toplam=toplam+sayac;
            System.out.println("Toplam="+toplam);
            do{
                //Statement;
          }while (sayac<=5);
*/
        }
    }

