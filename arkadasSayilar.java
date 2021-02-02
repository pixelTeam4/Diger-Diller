public class Main {

    public static void main(String[] args) {
        //220-284

        int sayi1=220; // birinci sayiyi giriyoruz
        int sayi2=284; // ikinci sayiyi giriyoruz
        int toplam1=0,toplam2=0;// toplamlarını bölenlerin toplamlarını tutacağımız sayılar için değişken tanımlıyoruz

        for (int i =1;i<sayi1;i++){ // sayi1 in tüm bölenlerini topluyoruz.
            if (sayi1%i ==0){
                toplam1=toplam1+i;
            }
        }

        for (int i =1;i<sayi2;i++){ // sayi2 nin tüm bölenlerini topluyoruz.
            if (sayi2%i==0){
                toplam2=toplam2+i;
            }
        }

        if (sayi1==toplam2 && sayi2==toplam1){ // sayi1 ,sayı2 nin bölenlerinin toplamına eşitmi && sayi2 ,sayi1 in bölenlerinin toplamına eşit mi sorgusu yaptık
            System.out.println("iki sayi arkadaştır. ");
        }
        else{
            System.out.println("iki sayı arkadaş değildir.");
        }
    }
}
