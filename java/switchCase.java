public class Main {

    public static void main(String[] args) {
        char grade = 'A'; //Sorgulamak için bir char değişkeni tanımladık.

        switch (grade) {//switch in parantez içine sorgulayacağımız yapyı yazıyoruz.
            case 'A'://Case durum demektir. Durumun ne olduğunda aşağıdaki işlemlerin yapılacağını belirtir.
                System.out.println("Mükemmel , Geçtiniz ");//Sorgunun işlem noktasıdır.
                break;//Sorgu bittikten sonra , sıradaki yapıya geçebilmek için sorguyu bitiriyoruz.

            case 'B':
            case 'C':// B ve C yi aynı anda aşağıdaki sorgunun geçerli olması durumda sorgulamak için birleştirdik.
                System.out.println("İyi , Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil , Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef , Kaldınız ");
                break;
            default://Yukarıdaki sorguların hiçbirisi olmadığında çalışacak bloktur.ifElse deki Else ye karşılık gelir.
                System.out.println("Geçersiz bir giriş yaptınız !");
        }
    }
}
