public class Move_zero_to_end {
    public int[] moveZeroToEnd(int[] arr){
        int zeros=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[arr.length-1-index];
                arr[arr.length-1-index]=arr[i];
                arr[i]=temp;
                index++;
                if(index==zeros){
                    break;
                }
            }
        }
        return arr;
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Move_zero_to_end move_zero_to_end=new Move_zero_to_end();
        int[] arry=new int[]{2,0,0,0,12};
        int[] arr=move_zero_to_end.moveZeroToEnd(arry);
        move_zero_to_end.printArray(arr);
    }
}
