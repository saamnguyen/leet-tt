package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public  int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = new int[]{2, 3, 4, 5, 7};
        int target = 9;

        System.out.println(twoSum.twoSum(arr, target).toString());
    }
}
