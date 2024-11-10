public class ResizeOfArray {
    public int[] resizeArray(int[] array, int capacity) {
        // the concept of resizing array is to create new array with desired size and put all the element of orginal array inside it.
        int[] temp = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        ResizeOfArray resizeOfArray = new ResizeOfArray();
        int[] array={1, 2, 3, 4, 5, 6, 7, 8, 9};
        array=resizeOfArray.resizeArray(array, 20);
        System.out.println(array.length);

    }
}
