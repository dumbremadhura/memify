package com.firstapps.madhura.memifyit;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MaddysIntent extends IntentService{

    private static final String TAG = "package com.firstapps.madhura.memifyit";

    public MaddysIntent() {
        super("maddys intent service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG,"maddys service has started");
    }
}
