package com.example.quana.quizme.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.quana.quizme.R;
import com.example.quana.quizme.model.Music;

public class MusicViewHolder extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView artist;
    private TextView year;

    public MusicViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.music_title_textview);
        artist = itemView.findViewById(R.id.music_artist_textview);
        year = itemView.findViewById(R.id.music_year_textview);
    }

    public void onBind(Music music) {
        title.setText("Title: " + music.getTitle());
       artist.setText("Director: " + music.getArtist());
        year.setText("Year: " + music.getYear());
    }
}


