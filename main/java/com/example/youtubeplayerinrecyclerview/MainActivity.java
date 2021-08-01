package com.example.youtubeplayerinrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Vector<YouTubeVideo> youTubeVideos=new Vector<YouTubeVideo>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"380\" height=\"300\" src=\"https://www.youtube.com/embed/EqNZKZjPWq0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"380\" height=\"300\" src=\"https://www.youtube.com/embed/su041kKtXZc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"380\" height=\"300\" src=\"https://www.youtube.com/embed/P-jKtzUuVcM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"380\" height=\"300\" src=\"https://www.youtube.com/embed/w4ClQO0FFQg\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"380\" height=\"300\" src=\"https://www.youtube.com/embed/pzPu-6eC2Wg\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter=new VideoAdapter(youTubeVideos);
        recyclerView.setAdapter(videoAdapter);

    }
}