package com.example.quana.quizme.model;

/**
 * Created by Quana on 11/16/17.
 */

public class Music {
        String title;
        String artist;
        String year;

        public Music (String title, String artist, String year) {
            this.title = title;
            this.artist = artist;
            this.year = year;
        }
        public String getTitle() {
            return title;
        }
        public String getArtist() {
            return artist;
        }
        public String getYear() {
            return year ;
        }
    }
