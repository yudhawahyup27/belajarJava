public class operatorUnary {
    public static void main (String[] args){
//         Unary + dan -
        int angka = 1;
        System.out.printf("%d Unary + %d \n", angka, +angka);
        System.out.printf("%d Unary - %d \n", angka, -angka);

//        Unary decrement dan Increment
        int angka2 = 10 ;
        angka2++;
        System.out.println("nilai Angka '++' = " + angka2);
        int angka3 = 10 ;
        angka3--;
        System.out.println("nilai Angka '--' = " + angka3);
//        Nilai Prefix
        int a = 10;
//        Nilai Postfix
        System.out.printf("Nilai dengan 'Prefix' menjadi = %d \n ", ++a);
        int b = 10;
        System.out.printf("Nilai dengan 'Prefix' menjadi = %d \n ", b++);

    }
}
