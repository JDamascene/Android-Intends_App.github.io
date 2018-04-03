package com.charlie.emobilis.workingwithintends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Getting the intend that started activity 2
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivityIntend.EXTRA_MESSAGE);

        //Capturing the text in the layout
        TextView mTextView = findViewById(R.id.txtNameNew);
        mTextView.setText(name);

    }
}
