package easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        //binary search
        while (low < high){
            int mid = (high + low) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
//
//Input: nums = [1,3,5,6], target = 5
//        Output: 2
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1