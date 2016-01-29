package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.baksoy.jokedisplayer.JokeDisplayActivity;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

import backend.builditbigger.gradle.udacity.com.jokeApi.JokeApi;

/**
 * Created by beraaksoy on 1/28/16.
 */
public class GetJokeTask extends AsyncTask<String, Void, String> {
    private JokeApi myApiService = null;
    private Context context;
    private final String JOKE = "joke";

    public GetJokeTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        Intent intent = new Intent(context, JokeDisplayActivity.class);
        intent.putExtra(JOKE, result);
        context.startActivity(intent);
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