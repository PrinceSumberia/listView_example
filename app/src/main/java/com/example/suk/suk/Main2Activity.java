package com.example.suk.suk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    ListView list;

    String[] maintitle = {
            "create a new review for your service", "send you 230 eeds fo your service",
            "write review for your service", "send you request for your need",
            "send you message", "send you request for your service", "send you request for your service"
    };

    String[] subtitle = {
            "Washing your room", "Washing your room",
            "Room design", "Wash my room",
            "", "Washing your room", "Washing your room"
    };

    String[] hrs = {
            "- 1h", "- 1h",
            "- 1h", "- 1h",
            "- 1h", "- 1h", "- 1h"
    };

    String[] user = {
            "Sara", "public_enemy",
            "down_maker", "your father",
            "cheat sheet", "boble master", "b.boy"
    };

    Integer[] imgid = {
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar;
        setContentView(R.layout.activity_main2);
        toolbar = findViewById(R.id.main_tool);
        setSupportActionBar(toolbar);
        setTitle("Notifications");
        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid, hrs, user);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if (position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {

                    Toast.makeText(getApplicationContext(), "Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {

                    Toast.makeText(getApplicationContext(), "Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {

                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
