//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( lookAndSay(5));
    }

    public static String lookAndSay(int n){
        String word = "1";

        for (int i=1; i < n; i++){
            word = nextWord(word);
        }

        return word;
    }

    public static String nextWord(String word) {
        final StringBuilder sb = new StringBuilder();
        int count  = 1;

        for (int i=1; i <= word.length(); i++){
            if (i == word.length() || word.charAt(i) != word.charAt(i-1) ){
                sb.append(count).append(word.charAt(i-1));
                count = 1;
            }else {
                count++;
            }
        }

        return sb.toString();
    }



}