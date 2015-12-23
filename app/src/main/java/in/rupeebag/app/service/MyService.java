package in.rupeebag.app.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Kapil on 06/12/15.
 */
public class MyService extends IntentService
{
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
Log.d("ARR","BG started");
    }
}
