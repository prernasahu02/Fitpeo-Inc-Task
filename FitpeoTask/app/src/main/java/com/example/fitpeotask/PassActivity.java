package com.example.fitpeotask;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        ImageButton cross = findViewById(R.id.cross);
        cross.setOnClickListener(View -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
        TextView tv_viewMap = findViewById(R.id.tv_viewMap);
        tv_viewMap.setOnClickListener(view -> {
            Log.e("test", "Testing click event");
            Intent intent = new Intent(PassActivity.this, MapActivity.class);
            startActivity(intent);
        });

        Spinner schedule = findViewById(R.id.schedule);
        ArrayAdapter<CharSequence> scheduleAdapter = ArrayAdapter.createFromResource(this, R.array.schedule_array, android.R.layout.simple_spinner_item);
        scheduleAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        schedule.setAdapter(scheduleAdapter);

    }
    }
