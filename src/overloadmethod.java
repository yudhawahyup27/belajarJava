public class overloadmethod {
    public static  void main (String[] args){

      over(10);
      over((float) 1.2f);
    }
    private static void over(int angka) {
        System.out.println("Cetak" + angka);
    }
    private static void over(float angka){

        System.out.println("Cetak" + angka);
    }
}
