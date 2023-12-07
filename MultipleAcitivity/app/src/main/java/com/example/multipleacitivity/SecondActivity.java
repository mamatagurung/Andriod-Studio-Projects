package com.example.multipleacitivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.second_activity);

//        Intent in   = getIntent();
//        int id = in.getIntExtra("id", 0);
//        String name = in.getStringExtra("Name");
//        String address = in.getStringExtra("Address");
//
//        TextView t = (TextView)findViewById(R.id.text);
//        t.setText("Id:"+id+"\n"+"Name= "+name+"\n"+"Address = "+address);

        Button btn = (Button)findViewById(R.id.button2);
        TextView t = (TextView)findViewById(R.id.text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("testing");
                Intent i = new Intent();
                i.putExtra("Message", "passed data");
                setResult(RESULT_OK,i);
                  finish();

            }
        });



    }

}
