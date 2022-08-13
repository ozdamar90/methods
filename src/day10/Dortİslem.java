package day10;

public class Dortİslem {
    public static void main(String[] args) {

/*        int x=7;
        int y=3;

        ikiSayiyiTopla(x,y);
        ikiSayiyiTopla(8,6);
        
    }
    //İki Tam Sayıyı Toplayan Bir Metot Yazınız. Sonuç Ekranda Gösterilsin.
    //Örnek: iki sayının toplamı 25'tir.
    
    public static void ikiSayiyiTopla(int a,int b){
        int toplam=a+b;
        System.out.println(String.format("iki Sayının toplamı %d.",toplam));*/

        int a=7;
        int b=3;
        int x=6;
        int y=9;
        int toplam=ikiSayiyiTopla(x,y);

        ikiSayiyiTopla(x,y);
        ikiSayiyiTopla(8,7);
        ikiSayiyiCıkar(6,9);


        System.out.println( "Toplam ="+ikiSayiyiTopla(6,9));
        System.out.println("Fark ="+ikiSayiyiCıkar(8,7));
    }
    //İki Tam Sayıyı Toplayan Bir Metot Yazınız. Sonuç Ekranda Gösterilsin.
    //Örnek: iki sayının toplamı 25'tir.

    public static int ikiSayiyiCıkar(int a,int b){
        //burada bir değişken tanımlamadan a ve b argümanlarını return a+b; yazmak suretiylede yukarıdaki toplam
        //değişkeninin içerisine assignment edebilirim.
        return a-b;
        //return a+b;
        //System.out.println(String.format("iki Sayının toplamı %d.",toplam));
        //Eğer bir argümanı geriye döndürmek istiyorsak yine birbirleri ile uymlu olmak zorunda.
        //yani void yerine int ise int, float ise float vb belirtmek gerekiyor.
        //ayrıca yapmak istediğimiz işlemin toplam, çıkarma, vb gibi ne elde etmek istiyorsak
        // onu tanuımlayan bir değişken yazmamız gerekli.
    }
    //İki tam sayıyı toplayıp,sonucunu çağırıldığı yere döndüren bir metot yazınız.
    public static int ikiSayiyiTopla(int x, int y){
        return x+y;
    }

}
