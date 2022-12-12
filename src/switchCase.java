import java.util.*;
public class switchCase {
    public static void main (String[] args){
//        Scanner input
        Scanner inputUser = new Scanner(System.in);

//        Isi input
        System.out.println("Masukan Inputan ");
    String kode = inputUser.next();

        switch (kode){
            case "Jakarta":
                System.out.println("Jawaban Anda Benar");
                break;
            case "Surabaya":
                System.out.println("Jawaban Anda Benar");
                break;
            default:
                System.out.println("Jawaban tidak ada");

        }

    }
}
