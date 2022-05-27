package easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits){
        int n = digits.length;
        System.out.println(n + " length");
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                //Neu < 9 thi digits tai vi tri i se ++1
                digits[i]++;
                System.out.println(digits[i]);

                //tra ve luon mang digits
                return digits;
            }

            //set vi tri i khi > 9
            digits[i] = 0;

        }



        //th 1 chu so 9
        System.out.println("hi");
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        //vi tri newNumber[1] khong dc khai bao nen se bang 0
        System.out.println("th < 9");
        return newNumber;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();

        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9})));
    }
}

//Input: digits = [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Incrementing by one gives 123 + 1 = 124.
//        Thus, the result should be [1,2,4].
//        Input: digits = [4,3,2,1]
//        Output: [4,3,2,2]
//        Explanation: The array represents the integer 4321.
//        Incrementing by one gives 4321 + 1 = 4322.
//        Thus, the result should be [4,3,2,2].
//        Input: digits = [9]
//        Output: [1,0]
//        Explanation: The array represents the integer 9.
//        Incrementing by one gives 9 + 1 = 10.
//        Thus, the result should be [1,0].