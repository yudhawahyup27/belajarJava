public class nestedif {

    public static  void main (String[] args) {
        int awal = 10;
        int kedua = 2;
        if ( awal == 1){
            System.out.println("Kondisi Pertama Jalan");
            if (kedua==2){
                System.out.println("Kondisi Kedua Jalan");
            } else if (kedua==3) {
                System.out.println("Kondisi Ketiga Jalan");
            }
        } else  {
            System.out.println("Kondisi Tidak Ada Yang Berjalan");
        }
    }
}
