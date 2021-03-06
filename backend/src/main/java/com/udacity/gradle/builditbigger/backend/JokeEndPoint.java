package com.udacity.gradle.builditbigger.backend;

/**
 * Created by beraaksoy on 1/26/16.
 */

import com.baksoy.jokelibrary.JokeFactory;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "com.udacity.gradle.builditbigger.backend",
                ownerName = "com.udacity.gradle.builditbigger.backend",
                packagePath = ""
        )
)
public class JokeEndPoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "setJoke")
    public JokeBean setJoke() {
        JokeFactory jokeFactory = new JokeFactory();
        int i = (int) Math.round(Math.random() * (jokeFactory.getJokeListSize() - 1));
        String joke = jokeFactory.getJoke(i);
        JokeBean response = new JokeBean();
        response.setJoke(joke);

        return response;
    }

    @ApiMethod(name = "getJoke")
    public JokeBean getJoke() {
        JokeBean response = new JokeBean();
        response.getJoke();

        return response;
    }

}
