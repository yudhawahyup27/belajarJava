import java.util.Arrays;

public class operasiarray {

    public static void main (String[] args){
        int[] dataArrays = {1,2,3,4,5,6};
        int[] dataArrays2 = new int [6];

        dataArrays2 = dataArrays;
        cetakArray(dataArrays);
        cetakArray(dataArrays2);

//        Array loops
        for (int index=0; index < dataArrays.length; index++  ){
            dataArrays2[index] = dataArrays[index];
        }
        cetakArray(dataArrays);
        cetakArray(dataArrays2);
// Array copyof

        int[] dataArrays3 = Arrays.copyOf( dataArrays ,3);
       cetakArray(dataArrays);
       cetakArray(dataArrays3);

//     Array copyRange

        int[] dataArrays4 = Arrays.copyOfRange( dataArrays,4,5);
        cetakArray(dataArrays);
        cetakArray(dataArrays4);

//        Arrays fill

        int[] dataArrays5 = new int [10];
        Arrays.fill(dataArrays5,5);
        cetakArray(dataArrays5);

//        Komperasi Arrays equls

      int[]  dataArrays6 = {1,2,3,4,5,6};
      int[] dataArrays7 = {2,1,6,3,7,5,8,4};

      System.out.println(Arrays.equals(dataArrays6,dataArrays7));

        if ( Arrays.equals(dataArrays6,dataArrays7)){
            System.out.println("Data Sama");
        } else {
            System.out.println("Data Tidak Sama");
        }
//        Array mana yang lebih besar
        System.out.println(Arrays.compare(dataArrays6,dataArrays7));
        System.out.println(Arrays.mismatch(dataArrays6,dataArrays7));
//        sort arrays

        cetakArray(dataArrays7);
        Arrays.sort(dataArrays7);
        cetakArray(dataArrays7);
        // search Arrays
        int angka = 3;

        int posisi = Arrays.binarySearch(dataArrays7, angka);
    }

    private static void cetakArray (int[] dataArrays){
    System.out.println("Data Arrays = "+ Arrays.toString(dataArrays));
    }
}
