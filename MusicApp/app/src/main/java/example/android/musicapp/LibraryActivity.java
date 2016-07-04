package example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        final TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);

            }
        });

        final TextView podcast = (TextView) findViewById(R.id.podcast);
        podcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PodcastIntent = new Intent(LibraryActivity.this, PodcastActivity.class);
                startActivity(PodcastIntent);
            }
        });

    }
}
