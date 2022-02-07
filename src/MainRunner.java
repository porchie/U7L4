import java.util.ArrayList;
import java.util.Arrays;

public class MainRunner {
    public static void main(String[] args) {

        String mySentence = "This is my sentence!";
        ArrayList<String> reversedWords = ArrayListAlgorithms.parseWordsAndReverse(mySentence);
        System.out.println(reversedWords);

        String mySentence2 = "It is a lovely day outside today don't you think?";
        ArrayList<String> reversedWords2 = ArrayListAlgorithms.parseWordsAndReverse(mySentence2);
        System.out.println(reversedWords2);

        String mySentence3 = "Hello";
        ArrayList<String> reversedWords3 = ArrayListAlgorithms.parseWordsAndReverse(mySentence3);
        System.out.println(reversedWords3);

    }
}
