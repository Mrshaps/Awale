package com.example.mrshaps.awale;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by MrSHAPS on 30/09/14.
 */
public class Plateau extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Context context = getApplicationContext();

        setContentView(new PlateauView(this));
    }
}
