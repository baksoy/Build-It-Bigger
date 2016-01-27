package com.baksoy.jokelibrary;

import java.util.ArrayList;

/**
 * Created by beraaksoy on 1/26/16.
 */
public class JokeFactory {

    private ArrayList<String> jokeList;

    public JokeFactory() {
        jokeList = new ArrayList<>();
        jokeList.add("Did you hear about the two antennas that got married?\n" +
                "The ceremony was long and boring, but the reception was great!");
        jokeList.add("What did one computer say to the other?\n" +
                "010101101010101010101");
        jokeList.add("Most people believe that if it ain't broke, don't fix it.\n" +
                "Engineers believe that if it ain't broke, it doesn't have enough features yet.");
        jokeList.add("I changed my password to \"incorrect\"." +
                "So whenever I forget what it is, the computer will say \"Your password is incorrect\".");
        jokeList.add("My kids are very optimistic. Every glass they leave sitting around the house is at least half full.");
        jokeList.add("A recent study has found that women who carry a little extra weight live longer than the men who mention it.");
        jokeList.add("Just read that 4,153,237 people got married last year, not to cause any trouble but shouldn't that be an even number?");
        jokeList.add("Life is all about perspective. The sinking of the Titanic was a miracle to the lobsters in the ship's kitchen.");
        jokeList.add("Money talks ...but all mine ever says is good-bye.");
        jokeList.add("I find it ironic that the colors red, white, and blue stand for freedom until they are flashing behind you.");
        jokeList.add("Isn't it great to live in the 21st century? Where deleting history has become more important than making it.");
        jokeList.add("When I told the doctor about my loss of memory, he made me pay in advance.");
        jokeList.add("Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.");
    }

    public String getJoke(int i) {
        return jokeList.get(i);
    }

    public int getJokeListSize() {
        return jokeList.size();
    }
}
