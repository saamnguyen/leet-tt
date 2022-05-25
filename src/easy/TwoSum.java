package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public    int[] twoSum(int[] numbers, int target){

        //Khoi tao 1 int[] voi length la 2. Vi result chi can output ra 2 so.
        int[] result = new int[2];

        //Khoi tao 1 map de luu key sau nay can dung
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //loop qua arrays duoc truyen vao
        //phan tu dau tien i = 0 se khong bao h dc luu vao result
        for(int i = 0; i < numbers.length; i++){

            //neu phan tu thu 2 (numbers[i+1]) ma duoc target - di ma bang phan tu i thu nhat (i=0, duoc luu o dau , target
            // - numbers[i+1] = map(0) se return luon
            if(map.containsKey(target - numbers[i])){
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }

            //Luu phan tu dau tien (i = 0)
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = new int[]{2, 3, 4, 5, 7};
        int target = 9;

        System.out.println(arr.length);

        System.out.println(Arrays.toString(twoSum.twoSum(arr, target)));
    }
}
