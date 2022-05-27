package easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String str){
        int length = 0;

        for(int i = str.length() -  1; i >= 0; i--){
            //Neu k gap dau cach
            if(str.charAt(i) != ' '){
                length++;
            }else{
                //Neu ma o sau cua str co dau cach thi se quay lai vong for r +i
                if(length > 0) return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }
}

//Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.
//        Input: s = "   fly me   to   the moon  "
//        Output: 4
//        Explanation: The last word is "moon" with length 4.
//        Input: s = "luffy is still joyboy"
//        Output: 6
//        Explanation: The last word is "joyboy" with length 6.