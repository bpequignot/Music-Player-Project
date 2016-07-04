package example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

        final TextView whats_streaming = (TextView) findViewById(R.id.whats_streaming);
        whats_streaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whatsStreamingIntent = new Intent(PodcastActivity.this, WhatsStreamingActivity.class);
                startActivity(whatsStreamingIntent);
            }
        });

        final TextView library = (TextView) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(PodcastActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

    }
}
