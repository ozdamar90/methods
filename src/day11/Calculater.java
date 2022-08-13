package day11;


/*
* Metotların overload edilmesi
* */
public class Calculater {
    public static void main(String[] args) {

        topla(5.8, 9.7);
        topla(6,15);
        System.out.println("Toplam ="+topla(9.7,12.5)+"\nToplam ="+topla(4,9));
        System.out.println("Çıkar ="+cikar(98,45)+"\nÇıkar ="+cikar(45.1,78.21));
        System.out.println("86 F --->"+convertFahrenheitToCelcius(86)+"C");

    }
    //İki veya daha fazla metodun parametre tipleri ve/veya parameter adaetleri birbirinden farklı ise
    //metotların imzaları birbirinden farklıdır denilir. Buşekilde aynı ismde istenildiği kadar metot yazılabilir.
    // Buna metotların aşırı yüklemesi overload edilmesi denilir.
    //Metotların dönüş  tipleri imzadan sayılmaz.

    public static int topla(int x, int y){
        return x+y;

    }

    public static double topla(double x,double y){
        return x+y;
    }
    public static int cikar(int x,int y){
        return x-y;
    }
    public static double cikar(double x,double y){
        return x-y;
    }
    //Isı derecesi dönüşümü yapan program yazınız.
    public static double convertFahrenheitToCelcius(int grade){
        return (86-32)/1.8;
    }

}
