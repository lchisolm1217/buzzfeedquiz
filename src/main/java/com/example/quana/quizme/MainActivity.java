package com.example.quana.quizme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.quana.quizme.model.Music;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView musicRecyclerView = (RecyclerView) findViewById(R.id.music_recyclerview);

        List<Music> musics = newArrayList<>();
        musics.add(new Music("The Truth", ))

    }
}
