import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] sayilar = new int[]{1,2,5,7,9,0}; // aranacak dizi tanımlandı
        int aranacak = 5;// aranacak sayı tanımlandı
        boolean varMi=false; // dizide aramanın sonucu bulmak için tanımlandı

        for (int sayi:sayilar) {//Dizi dolaşıldı . Eğer sayı dizide varsa true döndü . eğer yoksa zaten false durumda
            if (sayi==aranacak){
                varMi=true;
            }
        }

        if (varMi)//eğer sayı bulunduysa aşağıda yazıldı.
        {
            System.out.println("Sayi Bulundu");
        }
        else
        {
            System.out.println("Sayı bulunamadı");
        }
    }
}
