package com.example.ramadan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;//This class is the primary API for playing sound and video.


    // MediaPlayer is a class which controls playback of audio/video files .....
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.ramadan);//R.raw.Ramadan ده مكان الاغنية
        //we have to call a static Method create() of this class.
        // This method returns an instance of MediaPlayer class.// instance of mediaplayer انا مش فاهمه يعني ايه بترجع

        // Its syntax is as follows −
        // MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);

        // * @param context the Context to use
        //     * @param resid the raw resource id (<var>R.raw.&lt;something></var>) for
        //     *              the resource to use as the datasource
        //     * @return a MediaPlayer object, or null if creation failed
        //     */
        //    public static MediaPlayer create(Context context, int resid) {
        //        int s = AudioSystem.newAudioSessionId();
        //        return create(context, resid, null, s > 0 ? s : 0);
        //    }



        mediaPlayer.start();
        //On call to start() method, the music will start playing from the beginning. If this method is called again after the pause() method, the music would start playing from where it is left and not from the beginning.
        //
        //In order to start music from the beginning, you have to call reset() method.
    }




    @Override
    protected void onPause() {
        super.onPause();
        ///معناها لما اخرج من app فقط من غيرback يقف ال audio علي طول

        mediaPlayer.stop();

    }



    }

