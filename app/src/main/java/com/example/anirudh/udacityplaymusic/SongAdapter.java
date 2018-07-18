package com.example.anirudh.udacityplaymusic;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_item, parent, false);
        }

        final Song currentSong = getItem(position);

        ImageButton mImageButton = (ImageButton) listItemView.findViewById(R.id.play_button);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(getContext(), SongPlayingActivity.class);
                play.putExtra(SongPlayingActivity.SONG_EXTRA, currentSong);
                getContext().startActivity(play);
            }
        });

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(currentSong.getSongName());

        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.song_artist);
        artistNameTextView.setText(currentSong.getArtistName());

        TextView songDurationTextView = (TextView) listItemView.findViewById(R.id.song_duration);

        songDurationTextView.setText(currentSong.getSongDuration());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentSong.getImageResourceId());

        return listItemView;
    }
}
