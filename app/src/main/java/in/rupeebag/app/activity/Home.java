package in.rupeebag.app.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import in.rupeebag.app.R;
import in.rupeebag.app.service.MyService;
import in.rupeebag.app.utils.Display;

public class Home extends AppCompatActivity {
    Intent service;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //service=new Intent(this,MyService.class);

        //startService(service);
ArrayList<String> list=new ArrayList<String>();
        list.add("25 coins received from jingle");
        list.add("50 coins received from jingle");
        list.add("25 coins received from jingle");
        list.add("75 coins received from jingle");
        list.add("200 coins received from referral");
        listView= (ListView) findViewById(R.id.list_coin_history);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,list));
        Display.t(this, "Hello snack");

    }
}
