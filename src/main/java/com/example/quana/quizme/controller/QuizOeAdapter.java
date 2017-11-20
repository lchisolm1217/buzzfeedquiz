package com.example.quana.quizme.controller;

/**
 * Created by Quana on 11/16/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quana.quizme.R;
import com.example.quana.quizme.view.MusicViewHolder;
import com.example.quana.quizme.model.Music;

import java.util.List;

public class QuizOeAdapter extends RecyclerView.Adapter<MusicViewHolder>{

        private List<Music> musicList;

        public QuizOeAdapter(List<Music> musicList) {
            this.musicList = musicList;
        }

        @Override
        public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_itemview, parent, false);
            return new MusicViewHolder(childView);
        }

        @Override
        public void onBindViewHolder(MusicViewHolder holder, int position) {
            Music music = musicList.get(position);

            holder.onBind(music);
        }

        @Override
        public int getItemCount() {
            return musicList.size();
        }
    }
