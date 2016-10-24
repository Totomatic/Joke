package com.example.thoma.joke;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class WombleService extends IntentService {
    public MediaPlayer mediaPlayer;
    public boolean isOn=false;

    public WombleService(){
        super("WombleService");
    }

    @Override
    protected void onHandleIntent(Intent intent){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wombling_song);
        if (isOn){
            mediaPlayer.stop();
            isOn=!isOn;
        }else {
            mediaPlayer.start();
            isOn=!isOn;
        }
    }

}