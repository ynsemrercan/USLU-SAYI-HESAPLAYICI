import java.util.Scanner;
public class ExponentialCalculator {

    static int expNum(int a,int b){

        int result=1;
        for(int i=1;i<=b;i++){

            result *= a ;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){

            System.out.println("Üssü Alınacak Sayıyı Giriniz: ");
            int a= input.nextInt();

            System.out.println("Üs Değerini Giriniz Giriniz: ");
            int b= input.nextInt();

            System.out.println("Sonuç : "+ expNum(a,b));

            System.out.println("0-Çıkış\n1-Tekrar");
            int select= input.nextInt();

            if(select==0){

                break;
            }

        }



    }
}