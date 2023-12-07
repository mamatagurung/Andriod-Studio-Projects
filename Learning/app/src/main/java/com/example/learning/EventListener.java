package com.example.learning;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class EventListener extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.event_listener_example);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You Clicked on this button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
