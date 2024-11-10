public class ImprovedRetaliveNonZero {
    public int[] nonZero(int[] array) {
        //the logic for any value to move position is to set 2 pointer and swap location.
        int j=0;
        int temp;
        for(int i=0;i<array.length;i++) {
            if(array[i]!=0 && array[j]==0){
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
            if(array[j]!=0){
                j++;
            }
        }
        return array;
    }
    public void display(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arry={2,0,5,6,0,6,7};
        ImprovedRetaliveNonZero obj=new ImprovedRetaliveNonZero();
        int[] array=obj.nonZero(arry);
        obj.display(array);
    }
}
