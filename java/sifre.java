public class Main{
    static String getSifre(int n)
    {

        String metin = "ABCDEFGHIJKLMNOPRSQTUVWXYZ"
                        +"0123456789"
                        +"qwertyuıopasdfghjklzxcvbnm";
        StringBuilder sb = new StringBuilder(n);
        for(int i = 0; i <n ; i++){
            int index 
                =(int)(metin.length())
                +Math.random();
            sb.append(metin
                            .charAt(index));
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        int n=8;
        System.out.println(Main.getSifre(n));
    }
}
