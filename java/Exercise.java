public class Main {

    public static void main(String[] args) {
        double [] myList={1.2,6.4,4.3,5.6};// new'leme işlemine gerek kalmadan bu şekilde de yazılabilir
        double total=0; // toplam işlemini yapabilmek için toplamı tutacak değişken
        double max = myList[0]; // sıralama yapabilmek için herhangi birine eşitlememiz yeterli . bu mylist 1 yada 2 de olabilirdi

        for (double number : myList){//foreach java da olmadığı için bu formatta yazılıyor . yani double türündeki number mylisti teker teker geziyor
            if (max<number){//Burada gezilen sayı teker teker max değişkeniyle karşılaştırma yapılıyor. hangisi büyükse numbere kayıt ediliyor
                max=number;
            }
            total=total+number;//number sırayla gelip buraya kayıt oluyor ve bu sırada toplanıyor .
            System.out.println(number);
        }
        System.out.println("Toplam :"+total); // 17.5 çıkacaktır sonuç
        System.out.println("En büyük :"+max);// en büyük myList[1] olacaktır yani 6.4
    }
}
