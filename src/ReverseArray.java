public class ReverseArray {

    public static void reverse (int[] array){
        int length = array.length-1;
        int[] reverse = new int[array.length];

        for (int x = 0; x<array.length;x++){
            reverse[x] = array[length];
            length--;
        }

        System.arraycopy(reverse, 0, array, 0, array.length);
    }

}
