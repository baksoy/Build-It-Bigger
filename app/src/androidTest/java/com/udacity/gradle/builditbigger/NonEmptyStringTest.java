package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

/**
 * Created by beraaksoy on 1/28/16.
 */
public class NonEmptyStringTest extends AndroidTestCase {

    private static final String LOG_TAG = NonEmptyStringTest.class.getSimpleName();

    @SuppressWarnings("unchecked")
    public void test() {
        String result = null;
        GetJokeTask getJokeTask = new GetJokeTask(getContext());
        getJokeTask.execute();
        try {
            result = getJokeTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        Log.i(LOG_TAG, result);
        assert result != null;
        assertTrue(!result.isEmpty());
    }
}
