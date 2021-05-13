package com.example.buihoangdat_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfomartionActivity extends AppCompatActivity {
   private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomartion);
         bt = findViewById(R.id.button);
         bt.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(InfomartionActivity.this, MainActivity.class);
                 startActivity(intent);
             }
         });
    }
}