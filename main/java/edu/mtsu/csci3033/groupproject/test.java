package edu.mtsu.csci3033.groupproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;


public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

            // Get the Intent that started this activity and extract the string
            Intent intent = getIntent();
            int message = intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);
            String display = String.valueOf(message);

            // Capture the layout's TextView and set the string as its text
            TextView textView = (TextView) findViewById(R.id.displayTextView);
            textView.setText(display);

    }
}
