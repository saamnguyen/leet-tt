package easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){
        int i = 0;
        System.out.println(Arrays.toString(nums));
        for(int n : nums){
            System.out.println(n + " n ");
            System.out.println(i + " i ");

            //so dau thi i luon tang them 1, se duyet tung so va so sanh voi so i - 1
            if(i == 0 || n > nums[i - 1]){
                nums[i++] = n;

            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4, 6, 6, 10}));
    }
}
