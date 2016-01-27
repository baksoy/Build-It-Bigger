package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.baksoy.jokedisplayer.JokeDisplayActivity;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

import backend.builditbigger.gradle.udacity.com.jokeApi.JokeApi;


public class MainActivity extends ActionBarActivity {

    private final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        GetJokeTask getJokeTask = new GetJokeTask();
        getJokeTask.execute();
    }

    public class GetJokeTask extends AsyncTask<String, Void, String> {

        private JokeApi myApiService = null;

        @Override
        protected void onPostExecute(String result) {
            //super.onPostExecute(s);
            Intent intent = new Intent(getApplicationContext(), JokeDisplayActivity.class);
            intent.putExtra(JOKE, result);
            startActivity(intent);
        }

        @Override
        protected String doInBackground(String... params) {
            if (myApiService == null) {  // Only do this once
                myApiService = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                        .setRootUrl("https://demogradle-2016.appspot.com/_ah/api/").build();
            }
            try {
                return myApiService.setJoke().execute().getJoke();
            } catch (IOException e) {
                return e.getMessage();
            }
        }
    }
}
