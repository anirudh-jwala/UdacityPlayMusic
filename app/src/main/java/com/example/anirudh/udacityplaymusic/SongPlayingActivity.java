package com.example.anirudh.udacityplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SongPlayingActivity extends AppCompatActivity {

    public static final String SONG_EXTRA = "CLICKED_SONG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_playing);

        if (getIntent() != null && getIntent().hasExtra(SONG_EXTRA)) {
            populateUi((Song) getIntent().getSerializableExtra(SONG_EXTRA));
        }
    }

    private void populateUi(Song song) {
        TextView songNameView = (TextView) findViewById(R.id.song_name_display);
        TextView artistNameView = (TextView) findViewById(R.id.artist_name_display);
        ImageView songArtView = (ImageView) findViewById(R.id.song_image_art);

        songNameView.setText(song.getSongName());
        artistNameView.setText(song.getArtistName());
        songArtView.setImageResource(song.getImageResourceId());
    }

    public void PreviousSong(View view) {
        Toast.makeText(getApplicationContext(), "Playing Previous Song",
                Toast.LENGTH_SHORT).show();
    }

    public void PlaySong(View view) {
        Toast.makeText(getApplicationContext(), "Playing Song",
                Toast.LENGTH_SHORT).show();
    }

    public void NextSong(View view) {
        Toast.makeText(getApplicationContext(), "Playing Next Song",
                Toast.LENGTH_SHORT).show();
    }
}
