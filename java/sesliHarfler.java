public class Main {

    public static void main(String[] args) {
        char harf ='e';
        if (harf =='a' || harf=='ı'|| harf=='o' || harf=='u'){
            System.out.println("Kalın sesli harf");
        }
        else{
            System.out.println("Ince sesli harf");
        }

        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("Ince sesli harf ");

        }
    }
}
