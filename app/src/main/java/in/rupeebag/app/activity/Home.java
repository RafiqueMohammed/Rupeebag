package in.rupeebag.app.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.rupeebag.app.R;
import in.rupeebag.app.service.MyService;

public class Home extends AppCompatActivity {
    Intent service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        service=new Intent(this,MyService.class);

        startService(service);
    }
}
