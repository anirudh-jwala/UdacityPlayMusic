package com.example.anirudh.udacityplaymusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
    }

    public void PreviousSong(View view) {
        Toast.makeText(this, "Previous Song will be played", Toast.LENGTH_SHORT).show();
    }

    public void NextSong(View view) {
        Toast.makeText(this, "Next Song will be played", Toast.LENGTH_SHORT).show();
    }

    public void PlaySong(View view) {
        Toast.makeText(this, "Current Song is being played/paused", Toast.LENGTH_SHORT).show();
    }
}