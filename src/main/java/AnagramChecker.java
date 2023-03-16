/**
 * @author mmehrotra
 */
public class AnagramChecker {

    static int NO_OF_CHARS = 256;

    public static void main(String args[]){
        String text1 = " plus ";
        String text2 = " sulp";
        System.out.println(areAnagrams(text1,text2));
    }

    public static boolean areAnagrams(String str1,String str2) {

        if(str1.length() != str2.length())
            return false;
        char str1_freq[] = new char[NO_OF_CHARS];
        char str2_freq[] = new char[NO_OF_CHARS];

        char str1Array[] = str1.toCharArray();
        char str2Array[] = str2.toCharArray();

        for(int i = 0;i < str1Array.length && i< str2Array.length;i++){
            str1_freq[str1Array[i]]++;
            str2_freq[str2Array[i]]++;
        }

        for(int i  =0 ;i<NO_OF_CHARS;i++)
            if (str1_freq[i] != str2_freq[i])
                return false;
        return true;

    }
}
