public class operatorbitwase {

    public static void main(String[] args){
        byte a = 2;
        byte b,c;
        String a_bits,b_bits,c_bits;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
    System.out.printf("%s = %d \n", a_bits, a);
//    operator shift left
       b  = (byte)(a << 2);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);

//        operator bitween OR
        b  = (byte)(a << 2);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);

        c = (byte)(a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);

    }
}
