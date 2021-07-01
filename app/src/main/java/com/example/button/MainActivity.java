package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout body;
    ToggleButton tb_button;
    Switch sw_button;
    Button btn;
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        body = findViewById(R.id.body);
        tb_button = findViewById(R.id.tb_button);
        sw_button = findViewById(R.id.sw_button);
        btn = findViewById(R.id.btn);
        res = getResources();

        tb_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                System.out.println(isChecked);
                if(isChecked){
                    // body.setBackgroundColor(Color.RED);
                    body.setBackgroundColor(res.getColor(R.color.red));
                }
                if(!isChecked){
                    body.setBackgroundColor(Color.GREEN);
                }
            }
        });

        sw_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                System.out.println(isChecked);
                if(isChecked){
                    body.setBackgroundColor(Color.CYAN);
                }
                if(!isChecked){
                     body.setBackgroundColor(Color.WHITE);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hit");
            }
        });
    }
}