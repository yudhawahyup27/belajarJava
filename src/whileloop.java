public class whileloop {
    public static void main (String[] args){
        boolean kondisi =true;
        int x= 2;

        while (kondisi){
            x++;
            System.out.println(" looping ke- "+x);
            if ( x == 20){
                kondisi = false;
            }

        }
    }
}
