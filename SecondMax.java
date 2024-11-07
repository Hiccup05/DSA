public class SecondMax {
    public int secondmax(int[] arr){
        int max=Integer.MIN_VALUE; //the given array might be negative so making sure the value assigned is negative
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){  //as usual using loop
            if(arr[i]>max){  //condition to find max
                secondMax=max; //if we take the value replaced by array in max than at the end the last value repalce will be second max
                max=arr[i]; //finding the max
            }
            if(arr[i]>secondMax && arr[i]!=max){ //if first element is greater than second max and not equal to max than that is second max
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        SecondMax secondmax=new SecondMax();
        System.out.println(secondmax.secondmax(new int[]{-20,20,10}));
    }
}
