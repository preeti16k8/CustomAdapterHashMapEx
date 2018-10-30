package com.deepak.customadapterhashmapex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ThirdActivity extends YouTubeBaseActivity
implements YouTubePlayer.OnInitializedListener{
    YouTubePlayerView youTubePlayerView;
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youTube);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        key = b.getString("vkey");

        youTubePlayerView.initialize("AIzaSyAn8KJ2ozzXnxRdy0ADRz_qj2RevVLmsWg",this);
        Toast.makeText(ThirdActivity.this, "Success1", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Toast.makeText(ThirdActivity.this, "Success2", Toast.LENGTH_SHORT).show();
        youTubePlayer.loadVideo(key);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(ThirdActivity.this, "Failure", Toast.LENGTH_SHORT).show();
    }
}
