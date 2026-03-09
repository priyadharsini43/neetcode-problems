import java.util.*;

public class ScoreOfString {

    public static int scoreOfString(String s) {
        int score = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
            score += diff;
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = scoreOfString(s);
        System.out.println(result);
    }
}