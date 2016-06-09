package com.example.cheart.cheartcounselor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 6/9/2016.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        TextView username = (TextView) findViewById(R.id.usernameShow);
        Intent i = getIntent();
        username.setText(i.getStringExtra("username"));
    }
}
