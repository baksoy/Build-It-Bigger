package com.baksoy.jokelibrary;

import java.util.ArrayList;

public class JokeModel {

    private ArrayList<String> proverbList;

    public JokeModel() {
        proverbList = new ArrayList<>();
        proverbList.add("Did you hear about the two antennas that got married?\n" +
                "The ceremony was long and boring, but the reception was great!");
        proverbList.add("What did one computer say to the other?\n" +
                "010101101010101010101");
        proverbList.add("Most people believe that if it ain't broke, don't fix it.\n" +
                "Engineers believe that if it ain't broke, it doesn't have enough features yet.");
        proverbList.add("I changed my password to \"incorrect\"." +
                "So whenever I forget what it is, the computer will say \"Your password is incorrect\".");
        proverbList.add("My kids are very optimistic. Every glass they leave sitting around the house is at least half full.");
        proverbList.add("A recent study has found that women who carry a little extra weight live longer than the men who mention it.");
        proverbList.add("Just read that 4,153,237 people got married last year, not to cause any trouble but shouldn't that be an even number?");
        proverbList.add("Life is all about perspective. The sinking of the Titanic was a miracle to the lobsters in the ship's kitchen.");
        proverbList.add("Money talks ...but all mine ever says is good-bye.");
        proverbList.add("I find it ironic that the colors red, white, and blue stand for freedom until they are flashing behind you.");
    }


    public String getJoke(int i) {
        return proverbList.get(i);
    }

    public int getJokeListSize() {
        return proverbList.size();
    }
}
