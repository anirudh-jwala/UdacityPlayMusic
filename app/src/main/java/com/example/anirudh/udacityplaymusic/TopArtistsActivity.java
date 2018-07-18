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
        songs.add(new Song("Diamonds", "Rihanna","03:45",R.drawable.diamonds));
        songs.add(new Song("Delicate", "Taylor Swift","03:23",R.drawable.delicate));
        songs.add(new Song("God's Plan","Drake","04:21", R.drawable.godsplan));
        songs.add(new Song("Lose Yourself","Eminem","05:02",R.drawable.loseyourself));
        songs.add(new Song("Girls Like You","Maroon 5","04:14",R.drawable.girlslikeyou));
        songs.add(new Song("Sorry","Justin Bieber","03:32",R.drawable.sorry));
        songs.add(new Song("Naked Truth","Sean Paul","05:02",R.drawable.nakedtruth));
        songs.add(new Song("One Kiss","Calvin Harris","04:34",R.drawable.onekiss));
        songs.add(new Song("We Don't Talk Anymore","Charlie Puth","04:24",R.drawable.we_don_t_talk_anymore));
        songs.add(new Song("Capital Letters","Hailee Steinfeild","04:51",R.drawable.capitalletters));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
