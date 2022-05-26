package easy;

public class RemoveElement {
    public int removeElements(int[] nums, int val){
        int m = 0;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] != val){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        System.out.println(removeElement.removeElements(new int[]{3,2,2,3}, 3));
    }
}

//Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]
//        Input: nums = [0,1,2,2,3,0,4,2], val = 2
//        Output: 5, nums = [0,1,4,0,3,_,_,_]