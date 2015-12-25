package in.rupeebag.app.utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Rafique on 23/12/2015.
 */
public class Display {

    public static void c(String msg){
        Log.d("ARR",msg);
    }
    public static void t(Context c,String msg){
        Toast.makeText(c,msg,Toast.LENGTH_LONG).show();
    }
    public static void snack(String msg){
        Snackbar.make(null,"This is snack",Snackbar.LENGTH_LONG).show();
    }
}
