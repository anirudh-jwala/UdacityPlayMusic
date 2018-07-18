package com.example.anirudh.udacityplaymusic;

import android.content.Intent;

import java.io.Serializable;

public class Song implements Serializable {

    private String mSongName;
    private String mArtistName;
    private String mSongDuration;
    private int mImageResourceId;


    public Song(String songName, String artistName, String songDuration, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mSongDuration = songDuration;
        mImageResourceId = imageResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getSongDuration() {
        return mSongDuration;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
