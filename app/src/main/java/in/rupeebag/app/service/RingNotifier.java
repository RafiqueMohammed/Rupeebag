package in.rupeebag.app.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import in.rupeebag.app.utils.Display;

/**
 * Created by Rafique on 25/12/15.
 */
public class RingNotifier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Display.t(context,"Ringing..");
    }
}
