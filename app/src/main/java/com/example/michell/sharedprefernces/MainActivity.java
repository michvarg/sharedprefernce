package com.example.michell.sharedprefernces;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;        // create three private fields
    private CheckBox save;
    private Button next;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.user_name);          // create the connects
        save = findViewById(R.id.save);
        next = findViewById(R.id.Next_button);


        next.setOnClickListener(new View.OnClickListener() {      // set the action to the view
            @Override
            public void onClick(View v) {
                String usernameString = username.getText().toString();
                SharedPreferences.Editor editor = preferences.edit();
                if(save.isChecked()){
                    editor.putString("first", usernameString);
                    editor.putBoolean("isChecked", save.isChecked());
                    editor.commit();
                }
                Intent intent = new Intent(MainActivity.this, SecondActivity.class); // will send the button to the new activity.
                intent.putExtra("key",usernameString);
                startActivity(intent);

            }
        });
    }
}
