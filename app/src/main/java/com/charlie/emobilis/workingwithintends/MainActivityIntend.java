package com.charlie.emobilis.workingwithintends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityIntend extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "";
    Button mLaunchActivity;
    EditText mAct2text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intend);

        mLaunchActivity = findViewById(R.id.btnNextActivity);
        mAct2text = findViewById(R.id.editName);

        mLaunchActivity.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent
                Intent LaunchAct2 = new Intent(getApplicationContext(),SecondActivity.class);

                //The text
                String name = mAct2text.getText().toString();
                LaunchAct2.putExtra(EXTRA_MESSAGE, name);

                startActivity(LaunchAct2);
            }
        });
    }
}
