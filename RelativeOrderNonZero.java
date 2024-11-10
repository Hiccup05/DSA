public class RelativeOrderNonZero {
    public int[] relativeOrderNonZero(int[] arr) {
        int[] arry=new int[arr.length];
        int index=0;
        int ind=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                index++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                arry[ind]=arr[i];
                ind++;
            }
        }
        for(int i=0;i<arry.length;i++) {
            arr[i]=arry[i];
        }
        for(int i=0;i<index;i++) {
            arr[arr.length-i-1]=0;
        }
        return arr;
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arry ={5,2,0,3,5,2,0,0};
        RelativeOrderNonZero r=new RelativeOrderNonZero();
        int[] arr=r.relativeOrderNonZero(arry);
        r.printArray(arr);

    }
}
