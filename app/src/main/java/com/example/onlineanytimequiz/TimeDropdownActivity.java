package com.example.onlineanytimequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TimeDropdownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_time_dropdown);

        String[] arraySpinner = new String[] {
            "- Select -", "1:30pm", "10:30am", "12:30pm"
        };
        Spinner s = (Spinner) findViewById(R.id.time_dropdown_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        Button btn = (Button)findViewById(R.id.time_dropdown_continue_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimeDropdownActivity.this, HotspotActivity.class));
            }
        });
    }
}