package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.baksoy.jokedisplayer.JokeDisplayActivity;
import com.baksoy.jokelibrary.JokeModel;


public class MainActivity extends ActionBarActivity {

    private String mJoke;
    private JokeModel mJokeModel;
    private final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJokeModel = new JokeModel();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        int i = (int) Math.round(Math.random() * (mJokeModel.getJokeListSize() - 1));
        mJoke = mJokeModel.getJoke(i);
        Intent intent = new Intent(this, JokeDisplayActivity.class);
        intent.putExtra(JOKE, mJoke);
        startActivity(intent);
    }
}
