package com.example.anirudh.udacityplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class TopArtistsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Rihanna", "Diamonds","03:45",R.drawable.ic_launcher_background));
        songs.add(new Song("Taylor Swift", "Delicate","03:23",R.drawable.ic_launcher_background));
        songs.add(new Song("Drake","God's Plan","04:21", R.drawable.ic_launcher_background));
        songs.add(new Song("Eminem","Lose Yourself","05:02",R.drawable.ic_launcher_background));
        songs.add(new Song("Justin Bieber","Sorry","02:14",R.drawable.ic_launcher_background));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
