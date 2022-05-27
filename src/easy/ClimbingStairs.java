package easy;

public class ClimbingStairs {
    public int climbingStairs(int n){
        if(n <=0) return 0;
        if(n == 1) return 1;
        if(n ==2) return  2;

        int one_step_before = 2;

        int two_steps_before = 1;
        int all_ways = 0;

        for(int i = 2; i < n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbingStairs(3));
    }
}

//Input: n = 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps
//        Input: n = 3
//        Output: 3
//        Explanation: There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step