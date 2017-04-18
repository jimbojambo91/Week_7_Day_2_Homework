package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    private TextView answerCount;
    private TextView answerUnique;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        Log.d(getClass().toString(), "onCreate called");

        answerCount = (TextView) findViewById(R.id.answer_count);
        answerUnique = (TextView) findViewById(R.id.answer_unique);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("count");
        String uniqueAnswer = extras.getString("unique");

        answerCount.setText(answer);
        answerUnique.setText(uniqueAnswer);
    }
}
