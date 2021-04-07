import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Calc clc=new Calc();
        Scanner girdi=new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz !");
        System.out.println("1- Toplama \n2- Cıkartma \n3- Çarpma \n4- Bölme");
        int secim=girdi.nextInt();
        if (secim==1){
            clc.topla();
        }
        else if (secim==2){
            clc.cikart();
        }
        else if(secim==3){
            clc.carp();
        }
        else if(secim==4){
            clc.bol();
        }
        else{
            System.out.println("Lütfen Seçiminizi Kontrol ediniz ! ");
        }

    }
}
