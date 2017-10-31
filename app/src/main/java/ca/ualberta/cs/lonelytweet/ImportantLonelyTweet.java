package ca.ualberta.cs.lonelytweet;

import java.util.Date;

/**
 * Created by atsmith on 10/31/17.
 */

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet(String text, Date date){
        this.tweetDate = date;
        this.tweetBody = text;
    }

    @Override
    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20);

    }

    @Override
    public String getTweetBody(){
        return this.tweetBody.toUpperCase();
    }
}
