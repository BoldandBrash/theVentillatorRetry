package b.boldandbrash;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CoolDownActivity extends AppCompatActivity {

    //create array of coping questions
    private int i;
    private TextView question_box = (TextView)findViewById(R.id.copingquestion);
    private EditText answer_box = (EditText)findViewById(R.id.copingresponse);
    private Resources res = getResources();
    private String[] coping_questions = res.getStringArray(R.array.coping_questions);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_down);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //intitalize variables to track coping questions
        i = 0;
        question_box.setText(coping_questions[i++]);
    }
    public void fabClick(View v){
        //don't know what this does
        Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

        //changes question display and clears the EditText
        question_box.setText(coping_questions[i++]);
        answer_box.setText("");

        //!!!add code to save responses to a file


        if(i <= 6)
        {
            Intent intent = new Intent();

            //!!!add more code to transfer to whichever activity comes next
        }
    }
}
