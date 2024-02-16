import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        // Add 10 words to the ArrayList
        words.add("The");
        words.add("quick");
        words.add("brown");
        words.add("fox");
        words.add("jumps");
        words.add("over");
        words.add("the");
        words.add("lazy");
        words.add("dog");
        words.add(".");

        // Create n sentences with a maximum length of 10 words
        int n = 5; // Change this to the desired number of sentences
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            StringBuilder sentence = new StringBuilder();
            int sentenceLength = random.nextInt(10) + 1; // Generate a random sentence length between 1 and 10

            for (int j = 0; j < sentenceLength; j++) {
                int wordIndex = random.nextInt(words.size());
                sentence.append(words.get(wordIndex)).append(" ");
            }

            // Remove the extra space at the end and print the sentence
            System.out.println(sentence.toString().trim());
        }
    }
}


