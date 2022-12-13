import java.util.Arrays;

public class arrays {
    public  static void main (String [] args){
        int[] array = {1,2,3,4,5};
        int[] array2 = new int[10];
        array2=array;
        System.out.println(Arrays.toString(array) );
        System.out.println(Arrays.toString(array2) );


    }
}
