package com.example.analog_digital_clock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {
    private static DigitalClock digitalClock;
    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButton();
    }
    public void onClickButton(){
        digitalClock = (DigitalClock)findViewById(R.id.d_clock);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digitalClock.getVisibility() == DigitalClock.GONE){
                    digitalClock.setVisibility(DigitalClock.VISIBLE);
                }
                else {
                    digitalClock.setVisibility(DigitalClock.INVISIBLE);
                }
            }
        });
    }
}