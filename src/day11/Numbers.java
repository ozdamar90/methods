package day11;

public class Numbers {
    public static void main(String[] args) {
/*
        System.out.println("Büyük ="+büyükSayi(45,65));
        showMax(5,90);
*/

        int kucukSayi=getMin(12,787);

        System.out.println("Küçük sayı= "+getMin(45,98));
        System.out.println("Küçük Sayı ="+kucukSayi);
    }
    //Verilen iki sayıdan büyük olanı tespit eden metot yazınız.
/*    public static int büyükSayi(int x,int y){
        int büyük=x;
        if(y>büyük);
        büyük=y;

        return büyük;*/



    //public static void showMax(int x,int y){
       // System.out.println("Max ="+büyükSayi(x,y));

    //Verilen iki sayıdan küçük olanı tespit eden metot yazınız.

    public static int getMin(int a,int b){
    int min=a;
    if(b<min){
        min=b;
    }
        return min;

    }
}

