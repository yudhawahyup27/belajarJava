import java.util.Scanner;

public class scannerInput {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        int hasil,sisi;

        System.out.println("Masukan Sisi Kubus");
        sisi = userInput.nextInt();
        hasil = sisi * sisi ;
        System.out.println("Hasilnya adalah " + hasil);
    }


}
