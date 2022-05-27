package easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums){
        int maxSoFar = nums[0], maxEndingHere = nums[0];

        for(int i = 1; i < nums.length; i++){
            //So sanh mang cua so dang trc + so hien tai voi so hien tai
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            System.out.println(maxEndingHere + " here");

            //so sanh so dau tien voi tong cua maxEndingHere
            //lay gia tri max cua mang con lon nhat
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            System.out.println(maxSoFar + " far");
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();

        System.out.println(maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}


//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
//        Input: nums = [1]
//        Output: 1
//        Input: nums = [5,4,-1,7,8]
//        Output: 23