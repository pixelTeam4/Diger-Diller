public class Main {

    public static void main(String[] args) {
        int [] sayilar = new int[]{1,2,3,4,5,6,7,8};
        int aranacak=1;
        boolean varMi=false;
        // aranacak değer , sayilar dizisinin içerisinde olup olmadığı bulunacak

        for(int sayi : sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi mevcuttur. "+aranacak);
        }
        else{
            System.out.println("Sayi mevcut değildir . "+aranacak);
        }
    }
}
