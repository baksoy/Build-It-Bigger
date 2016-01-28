package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

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
        new GetJokeTask(this).execute();
    }

//    public class GetJokeTask extends AsyncTask<String, Void, String> {
//
//        private JokeApi myApiService = null;
//
//        @Override
//        protected void onPostExecute(String result) {
//            //super.onPostExecute(s);
//
//            if (result != null) {
//                Intent intent = new Intent(getApplicationContext(), JokeDisplayActivity.class);
//                intent.putExtra(JOKE, result);
//                startActivity(intent);
//            } else {
//                Toast.makeText(getApplicationContext(), "Error: Not able to fetch Joke", Toast.LENGTH_SHORT).show();
//            }
//        }
//
//        @Override
//        protected String doInBackground(String... params) {
//            if (myApiService == null) {  // Only do this once
//                myApiService = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
//                        .setRootUrl("https://demogradle-2016.appspot.com/_ah/api/").build();
//            }
//            try {
//                return myApiService.setJoke().execute().getJoke();
//            } catch (IOException e) {
//                return e.getMessage();
//            }
//        }
//    }
}
