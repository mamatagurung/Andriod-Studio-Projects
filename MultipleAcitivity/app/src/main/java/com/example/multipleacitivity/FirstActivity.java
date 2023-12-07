package com.example.multipleacitivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FirstActivity extends Activity {
    TextView txt;
    @Override
    public void onCreate(@Nullable Bundle savedInstantState){
       super.onCreate(savedInstantState);
       setContentView(R.layout.first_activity);
        TextView txt = findViewById(R.id.text1);
       Button btn = (Button)findViewById(R.id.button);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(FirstActivity.this, SecondActivity.class);
//               i.putExtra("id", 001);
//               i.putExtra("Name", "Mamata");
//               i.putExtra("Address", "Samakhusi");
               startActivityForResult(i,1);
           }
       });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 100){
            if (resultCode == RESULT_OK){
            String message = data.getStringExtra("message");
            TextView txt = findViewById(R.id.text1);
            txt.setText(message);
        }
        }


    }

}
