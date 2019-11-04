package com.example.raterecord;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonTwin, buttonEnd, buttonCig;
    MediaPlayer mpCig, mpTwin, mpEnd;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCig = findViewById(R.id.btnCig);
        buttonCig.setOnClickListener(bCig);
        mpCig= new MediaPlayer();
        mpCig= MediaPlayer.create(this,R.raw.cigarette_daydreams);

        buttonEnd = findViewById(R.id.btnEnd);
        buttonEnd.setOnClickListener(bEnd);
        mpEnd= new MediaPlayer();
        mpEnd= MediaPlayer.create(this,R.raw.watingforthend);

        buttonTwin = findViewById(R.id.btnTwin);
        buttonTwin.setOnClickListener(bTwin);
        mpTwin= new MediaPlayer();
        mpTwin = MediaPlayer.create(this, R.raw.twinsizemattress);


        playing=0;
    }
    Button.OnClickListener bTwin = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpTwin.start();
                    playing = 1;
                    buttonTwin.setText("Pause");

                    break;
                case 1:
                    mpTwin.pause();
                    playing = 0;
                    buttonTwin.setText("Resume Twin Sized Mattress");

                    break;
            }
        }

    };

    Button.OnClickListener bCig = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpCig.start();
                    playing = 1;
                    buttonCig.setText("Pause");

                    break;
                case 1:
                    mpCig.pause();
                    playing = 0;
                    buttonCig.setText("Resume Cigarette Daydreams");

                    break;
            }
        }

    };


    Button.OnClickListener bEnd = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpEnd.start();
                    playing = 1;
                    buttonEnd.setText("Pause");

                    break;
                case 1:
                    mpEnd.pause();
                    playing = 0;
                    buttonEnd.setText("Resume Waiting for the End");

                    break;
            }
        }

    };

}

