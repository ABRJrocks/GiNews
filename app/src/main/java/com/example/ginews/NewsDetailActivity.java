package com.example.ginews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewsDetailActivity extends AppCompatActivity {

    String title, desc, content, imageURL, url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
    }
}