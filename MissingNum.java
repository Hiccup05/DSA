public class MissingNum {
    public int missingNumber(int[] nums) {
        int max=nums.length+1;
        int sum= max*(max+1)/2;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        MissingNum mn = new MissingNum();
        System.out.println(mn.missingNumber(new int[]{1,2,4,5,6,7,3}));
    }
}
