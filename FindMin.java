public class FindMin {
    public int findMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        FindMin find = new FindMin();
        int min=find.findMin(new int[]{4,8,2,1,9,0});
        System.out.println(min);
    }
}