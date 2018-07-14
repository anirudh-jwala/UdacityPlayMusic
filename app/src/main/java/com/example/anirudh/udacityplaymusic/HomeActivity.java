package com.example.anirudh.udacityplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView topSongs = (TextView) findViewById(R.id.top_songs);
        topSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topSongsIntent = new Intent(HomeActivity.this, TopSongsActivity.class);
                startActivity(topSongsIntent);
            }
        });

        TextView topArtists = (TextView) findViewById(R.id.top_artists);
        topArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topArtistsIntent = new Intent(HomeActivity.this, TopArtistsActivity.class);
                startActivity(topArtistsIntent);
            }
        });

    }
}
