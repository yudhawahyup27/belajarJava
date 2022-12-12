public class dowhile {
    public static void main (String[] args){
        boolean kondisi = true;
        int x = 0;

        do {
         x++;
         System.out.println("cetak ke" + x);
         if (x==10){
             kondisi = false;
         }
        }while (kondisi);
    }
}
