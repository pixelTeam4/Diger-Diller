public class Main {

    public static void main(String[] args) {
        // En büyük sayıyı bul
        int sayi1 =60;
        int sayi2=50;
        int sayi3=40;
        /*----------------------*/
        int enBuyuk=sayi1;// ilk sorgu için herhangi bir atama yapıyoruz .

        //En büyük değişkenini sırayla sorguluyoruz . Ayrı ayrı sorgulayacağı için else if yapısı kullanılmıyor
        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        //En büyük değişkenini sırayla sorguluyoruz .
        if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        /*Yukarıdaki çııktılara göre enbüyük değişkenini yazdırıyoruz. */
        System.out.println(enBuyuk);
    }
}
