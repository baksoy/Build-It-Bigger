package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.AsyncTask;
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

        //Get your jokes from GCE instead of JokeModel
        //Use AsyncTask to pull your jokes from GCE
        //then send off your jokes to JokeDisplayActivity via Intent extra
        GetJokeTask getJokeTask = new GetJokeTask();

        mJoke = mJokeModel.getJoke(i); //remove this after GCE is live
        getJokeTask.execute(mJoke); //remove mJoke parameter. no need to pass in anything. just call execute
    }

    public class GetJokeTask extends AsyncTask<String, Void, String> {

        @Override
        protected void onPostExecute(String joke) {
            //super.onPostExecute(s);
            Intent intent = new Intent(getApplicationContext(), JokeDisplayActivity.class);
            intent.putExtra(JOKE, joke);
            startActivity(intent);
        }

        @Override
        protected String doInBackground(String... params) {
            // String joke
            // Get your joke from GCE here and return it below
            // return joke;
            return params[0]; //delete this after you return joke in previous line
        }
    }
}
