package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class WordActivity extends AppCompatActivity {

    private EditText wordsEditText;
    private Button countButton;
    private Word words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        wordsEditText = (EditText) findViewById(R.id.enter_text);
        countButton = (Button) findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(), "onCountButton was clicked");
        String textThatWasEntered = wordsEditText.getText().toString();
        Log.d(getClass().toString(), textThatWasEntered);

        words = new Word(textThatWasEntered);
        String wordCount = String.valueOf(words.countWords());
        HashMap UniqueCountHash = words.makeWordList();
        String hashString = UniqueCountHash.toString();
        Intent intent = new Intent(this, CountActivity.class);
        intent.putExtra("count", wordCount);
        intent.putExtra("unique", hashString);
        startActivity(intent);
    }
}
