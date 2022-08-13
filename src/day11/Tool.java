package day11;

public class Tool {
    public static void main(String[] args) {
    int aHiz=60;
    int aSure=3;
    int mesafe=calculateDistance(aHiz,aSure);
    int mesafe1=calculateDistance(90,5);
        System.out.println(String.format("A aracı %d kilometre yol aldı.",mesafe));
        System.out.println("B aracı"+mesafe1+" kilometre yol aldı. ");
        System.out.println("5'in karesi="+kareAl(5));


        int result=kuvvetAl(5,2);
        System.out.println("Result ="+result);
    }
    //Mesafe hesaplayan bir metot yazınız.
    public static int calculateDistance(int speed, int time){
        int distance=speed*time;
        return distance;
    }

    //Bir sayının kuvvetini alan metot yazınız.
    public static int kareAl(int sayi){
        return sayi*sayi;
    }
    public static int kuvvetAl(int sayi,int us){
        int carpim=1;
        for (int i = 0; i <us ; i++) {
            carpim *=sayi;
        }
        return carpim;
    }
}
