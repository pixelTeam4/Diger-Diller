import java.util.Scanner;
public class Calc {
    Scanner girdi=new Scanner(System.in);
    public void topla(){

        System.out.println("Toplanacak 1.Sayıyı giriniz ! ");
        int number1=girdi.nextInt();
        System.out.println("Toplanacak 2.Sayıyı giriniz ! ");
        int number2=girdi.nextInt();
        int sonuc=number1+number2;
        System.out.println(number1+" ve "+number2+" toplamı "+sonuc);

    }
    public void cikart(){
        System.out.println("Çıkarılacak 1.Sayıyı giriniz ! ");
        int number1=girdi.nextInt();
        System.out.println("Çıkarılacak 2.Sayıyı giriniz ! ");
        int number2=girdi.nextInt();
        int sonuc=number1-number2;
        System.out.println(number1+" ve "+number2+" farkı "+sonuc);
    }
    public void carp(){
        System.out.println("Carpilacak 1.Sayıyı giriniz ! ");
        int number1=girdi.nextInt();
        System.out.println("Carpilacak 2.Sayıyı giriniz ! ");
        int number2=girdi.nextInt();
        int sonuc=number1*number2;
        System.out.println(number1+" ve "+number2+" carpımı "+sonuc);
    }
    public void bol(){
        System.out.println("Bölünecek 1.Sayıyı giriniz ! ");
        int number1=girdi.nextInt();
        System.out.println("Bölünecek 2.Sayıyı giriniz ! ");
        int number2=girdi.nextInt();
        int sonuc=number1/number2;
        System.out.println(number1+" ve "+number2+" bölümü "+sonuc);
    }

}
