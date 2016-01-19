package com.baksoy.jokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by beraaksoy on 1/18/16.
 */
public class JokeDisplayActivity extends AppCompatActivity {
    private final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokedisplay);
        TextView jokeView = (TextView) findViewById(R.id.textView_joke);
        String joke = getIntent().getStringExtra(JOKE);
        jokeView.setText(joke);
    }
}
