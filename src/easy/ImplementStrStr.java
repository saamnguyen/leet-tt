package easy;

public class ImplementStrStr {
    public int strStr(String haystack, String needle){
        //Neu needle == null
        if(needle.length() == 0){
            return 0;
        }

        //neu haystack == null
        if(haystack.length() == 0){
            return -1;
        }

        for(int i = 0; i < haystack.length(); i++){
            //Neu needle > haystack (length)
            if(i + needle.length() > haystack.length()) break;

            System.out.println(i + " i 1");

            for(int j = 0; j < needle.length(); j++){
                System.out.println(i + " i 2");
                System.out.println(j + " j 2");

                //so sanh tung ki tu 1
                if(haystack.charAt(i + j) != needle.charAt(j)) break;
                System.out.println("break");

                //Neu j == length cua needle se return i luon
                if(j == needle.length() - 1) return i;
            }
        }

       return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr implementStrStr = new ImplementStrStr();

        System.out.println(implementStrStr.strStr("abcc123", "cc"));
    }
}

//return index dau tien cua needle truyen vao

//Input: haystack = "hello", needle = "ll"
//        Output: 2
//        Input: haystack = "aaaaa", needle = "bba"
//        Output: -1