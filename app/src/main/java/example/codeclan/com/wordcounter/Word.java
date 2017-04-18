package example.codeclan.com.wordcounter;

import java.util.HashMap;

/**
 * Created by user on 18/04/2017.
 */

public class Word {
    private String words;

    public Word(String words){
        this.words = words;
    }

    public String[] splitWords() {
        return this.words.split(" ");
    }

    public int countWords() {
        return splitWords().length;
    }

    public HashMap<String, Integer> makeWordList() {
        HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();
        String[] allWords = splitWords();
        for(String word : allWords){
            int count = 0;
            if(!listOfWords.containsKey(word)){
                listOfWords.put(word, 1);
            }
            else{
                count = listOfWords.get(word) + 1;
                listOfWords.remove(word);
                listOfWords.put(word, count);
            }
        }
        return listOfWords;
    }
}
