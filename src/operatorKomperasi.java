public class operatorKomperasi {
    public static  void main (String[] args) {
    int a,b;
    boolean hasilKomperasi;
    a = 2;
    b= 2;
    hasilKomperasi = ( a == b);
    System.out.printf("%d == %d --> %s \n",a,b, hasilKomperasi);
//    Pertidaksamaan
    a = 2;
    b= 2;
    hasilKomperasi = ( a != b);
    System.out.printf("%d != %d --> %s \n",a,b, hasilKomperasi);
//    kurang dari
    a = 2;
    b= 2;
    hasilKomperasi = ( a < b);
    System.out.printf("%d != %d --> %s \n",a,b, hasilKomperasi);
//    lebih dari
    a = 3;
    b= 2;
    hasilKomperasi = ( a >= b);
    System.out.printf("%d >= %d --> %s \n",a,b, hasilKomperasi);
    }
}
