package edu.mtsu.csci3033.groupproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.media.MediaPlayer;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "edu.mtsu.csci3033.groupproject.DIFFICULTY";
     private TextView displayDifficulty; //diplays the value of the seekbar
     private int difficultyLvl = 5;
     Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayDifficulty = (TextView) findViewById(R.id.displayDifficultytextView);
        displayDifficulty.setText("5");
        //listeners
        SeekBar difficultySeekBar = (SeekBar) findViewById(R.id.difficultySeekBar);
            difficultySeekBar.setOnSeekBarChangeListener(difficultySeekBarListener);


//        //start music
//        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.oedipussy);
//        mediaPlayer.start();
    }

    //event handler for seekbar. when seekbar is changed
    private OnSeekBarChangeListener difficultySeekBarListener = new OnSeekBarChangeListener() {
        @Override   //changes displays seek bar value when changed
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            difficultyLvl = progress;
            displayDifficulty.setText(String.valueOf(difficultyLvl));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
    //goes to the Addtion activity when addition button is clicked
    public void gotoAddition(View view){
                Intent intent = new Intent(this, test.class);
                intent.putExtra(EXTRA_MESSAGE, difficultyLvl);
                startActivity(intent);
    }

    //goes to the Subtraction activity when addition button is clicked
    public void gotoSubtraction(View view){
        Intent intent = new Intent(this, test.class);
        intent.putExtra(EXTRA_MESSAGE, difficultyLvl);
        startActivity(intent);
    }

    //goes to the Multiplication activity when addition button is clicked
    public void gotoMultiplication(View view){
        Intent intent = new Intent(this, test.class);
        intent.putExtra(EXTRA_MESSAGE, difficultyLvl);
        startActivity(intent);
    }

}
