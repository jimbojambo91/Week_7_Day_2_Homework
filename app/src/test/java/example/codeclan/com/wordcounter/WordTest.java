package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordTest {
    Word words;

    @Before
    public void before(){
        words = new Word("Does this work");
    }

    @Test
    public void canSplitWords(){
        String [] splitTextInitial = {"Does", "This", "Work"};
        String [] splitTextMethod = words.splitWords();
        assertEquals(splitTextInitial.length ,splitTextMethod.length);
    }

    @Test
    public void countWordsTest(){
        assertEquals(3, words.countWords());
    }

    @Test
    public void countUniqueWordsTest(){
        words = new Word("The man walked man");
        HashMap wordsHash = words.makeWordList();
        assertEquals(2, wordsHash.get("man"));
    }
}
