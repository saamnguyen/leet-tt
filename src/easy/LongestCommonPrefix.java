package easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0) return "";

        //Lay str[0] vi tri dau tien
        String pre = strs[0];
        System.out.println(strs.length);

        int i = 1;
        while (i < strs.length){
            //Neu ma chua tim ra chuoi giong thi substring di 1 chu o cuoi
            while (strs[i].indexOf(pre) != 0){
                System.out.println(strs[i] + " index");
                System.out.println(strs[i].indexOf(pre));
                System.out.println(pre + " start");
                pre = pre.substring(0, pre.length() - 1);
                System.out.println(pre + " end");
            }
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"1st2rr", "str1fasdf", "str2fsfsd"}));
    }
}

//Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//Input: strs = ["dog","racecar","car"]
//        Output: ""