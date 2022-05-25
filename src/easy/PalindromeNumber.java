package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        //dieu kien sai, la so am, khac 1 nhung < 10>
        if(x < 0 || (x != 0 && x % 10 == 0)) return  false;

        int rev = 0;
        while (x > rev){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
//        x == rev / 10 is for odd number of digits.
//        Suppose number is 45654, now it will come out of loop when x < rev i.e. x = 45 and rev = 456,
//        so to truncate the 6 of res, we use x = rev / 10. But this is not the case of even digits.
//        Suppose number is 456654, it will come out of loop when x <= res i.e. x = 456 and rev = 456,
//        so no need to truncate & we can use x == rev directly for it.

        //12321 k co x == rev / 10 se la false, danh cho nhung so co length la le
        return (x == rev || x == rev / 10);
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        System.out.println(palindromeNumber.isPalindrome(11));
    }
}
