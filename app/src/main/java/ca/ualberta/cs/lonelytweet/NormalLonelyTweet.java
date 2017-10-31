package ca.ualberta.cs.lonelytweet;

import java.util.Date;

/**
 * Created by atsmith on 10/31/17.
 */

public class NormalLonelyTweet extends LonelyTweet {

    public NormalLonelyTweet(String text, Date date){
        this.tweetDate = date;
        this.tweetBody = text;
    }

    @Override
    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10);

    }

    @Override
    public String getTweetBody(){
        return tweetBody;
    }
}
