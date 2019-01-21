 package com.example.michell.sharedprefernces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

 public class SecondActivity extends AppCompatActivity {
    private Intent intent;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.display_tv);
        intent.getExtras().get("key");

        String name = intent.getExtras().getString("key");

        textView.setText(name);


    }
}
