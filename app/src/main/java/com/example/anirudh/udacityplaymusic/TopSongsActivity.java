package com.example.anirudh.udacityplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Magenta Riddim", "DJ Snake", "03:14", R.drawable.riddim));
        songs.add(new Song("Back To You", "Selena Gomez", "03:27", R.drawable.backtoyou));
        songs.add(new Song("Havana", "Camila Cabello", "03:36", R.drawable.havana));
        songs.add(new Song("Mi Gente", "Willy William", "03:30",R.drawable.migente));
        songs.add(new Song("Wolves", "Selena Gomez", "03:18", R.drawable.wolves));
        songs.add(new Song("Dusk Till Dawn", "Zayn Malik", "04:28", R.drawable.dusktilldawn));
        songs.add(new Song("Animals", "Maroon 5", "05:21", R.drawable.animals));
        songs.add(new Song("Somebody", "The Chainsmokers", "03:53", R.drawable.somebody));
        songs.add(new Song("Mad Love", "Sean Paul", "04:24", R.drawable.madlove));
        songs.add(new Song("Something Just Like This", "The Chainsmokers", "04:48", R.drawable.sjlt));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
