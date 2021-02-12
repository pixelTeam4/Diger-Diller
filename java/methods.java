public class Main {

    public static void main(String[] args) {

        String mesaj="bugün hava çok güzel";
        int toplam=topla(2,3);
        System.out.println(toplam);
        int toplamHesapla=topla2(2,3,4,5,6,7,8,9,10);
        System.out.println(toplamHesapla);
        int faktoriyel=carp(1,2,3,4,5,6,7,8);
        System.out.println(faktoriyel);
        System.out.println("faktoriyel hesaplandı "+faktoriyel);
        int ikiSayiArasiniTopla=arasiniTopla(2,5);
        System.out.println(ikiSayiArasiniTopla+" iki sayi arasındaki sayılar toplandı");
        int ikiSayiArasınıCarp=arasiniCarp(1,5);
        System.out.println(ikiSayiArasınıCarp+" iki sayi arasındaki sayilar çarpildi");
        int sirala=sirala(25,3);
        System.out.println(sirala+" en buyuk sayıdır");
        int sirala2=sirala2(5,4,3);
        System.out.println(sirala2+"****");

    }
    public static void ekle(){
        System.out.println("eklendi");
    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void guncelle(){
        System.out.println("guncellendi");
    }
    public static int topla(int sayi,int sayi2){
        return sayi+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for (int sayi : sayilar){
            toplam=toplam+sayi;
        }
        return toplam;
    }
    public static int carp(int... sayilar){
        int carpim=1;
        for (int sayi:sayilar){
            carpim=carpim*sayi;
        }
        return carpim;
    }
    public static int arasiniTopla(int sayi1,int sayi2){
        int toplam=0;
        for (int i=sayi1;i<=sayi2;i++){
            toplam=toplam+i;
        }
        return toplam;

    }
    public static int arasiniCarp(int sayi1,int sayi2){
        int carpim=1;
        for (int i=sayi1 ; i<=sayi2;i++){
            carpim=carpim*i;
        }
        return carpim;
    }
    public static int sirala(int sayi1,int sayi2){
        int enBuyuk=sayi1;
        if (sayi1<sayi2){
            enBuyuk=sayi2;
        }
        else if (sayi1==sayi2){
            System.out.println("iki sayi birbirine eşittir"+sayi1);
        }
        else{
            enBuyuk=sayi1;
        }
        return enBuyuk;
    }
    public static int sirala2(int sayi1,int sayi2,int sayi3){
        int enBuyuk=sayi1;
        int ortanca=sayi2;
        int enKucuk=sayi3;

        if (sayi1>sayi2 && sayi1>sayi3){
            enBuyuk=sayi1;
            if (sayi2>sayi3){
                ortanca=sayi2;
                enKucuk=sayi3;
            }
            else {
                ortanca=sayi3;
                enKucuk=sayi2;
            }
            System.out.println("En büyük sayı :"+enBuyuk+" ortanca sayı : "+ortanca+" en küçük sayı : "+enKucuk);
        }else if (sayi2>sayi1 && sayi2>sayi3){
            enBuyuk=sayi2;
            if (sayi1>sayi3){
                ortanca=sayi1;
                enKucuk=sayi3;
            }else{
                ortanca=sayi3;
                enKucuk=sayi1;
            }
            System.out.println("En büyük sayı :"+enBuyuk+" ortanca sayı : "+ortanca+" en küçük sayı : "+enKucuk);
        }else if(sayi3>sayi1 && sayi3>sayi2){
            enBuyuk=sayi3;
            if (sayi1>sayi2){
                ortanca=sayi1;
                enKucuk=sayi2;
            }else{
                ortanca=sayi2;
                enKucuk=sayi1;
            }
            System.out.println("En büyük sayı :"+enBuyuk+" ortanca sayı : "+ortanca+" en küçük sayı : "+enKucuk);
        }
        return enBuyuk;


    }
}
