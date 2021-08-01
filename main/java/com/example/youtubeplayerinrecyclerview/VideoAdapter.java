package com.example.youtubeplayerinrecyclerview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder>{
    List<YouTubeVideo>youTubeVideoList;
    public VideoAdapter(){}
    public VideoAdapter(List<YouTubeVideo>youTubeVideoList)
    {
        this.youTubeVideoList=youTubeVideoList;
    }

    @NonNull
    @Override
    public VideoAdapter.MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_view,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull  VideoAdapter.MyViewHolder holder, int position) {
        holder.videoWeb.loadData(youTubeVideoList.get(position).getVideoUrl(),"text/html","utf_8");

    }

    @Override
    public int getItemCount() {
        return youTubeVideoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            videoWeb=itemView.findViewById(R.id.videoView);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient());
        }
    }
}
