import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Words are Anagram");
        } else {
            System.out.println("Words are Not Anagram");
        }
    }
}