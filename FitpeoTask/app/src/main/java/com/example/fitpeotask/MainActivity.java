package com.example.fitpeotask;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends PassActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pass =findViewById(R.id.pass);
        pass.setOnClickListener(View ->{
            Intent intent = new Intent(this,PassActivity.class);
            startActivity(intent);
        });

        Button office = findViewById(R.id.office);
        office.setOnClickListener(View -> Toast.makeText(getApplicationContext(), "Welcome to Office", Toast.LENGTH_SHORT).show());

        Button people = findViewById(R.id.people);
        people.setOnClickListener(View -> Toast.makeText(getApplicationContext(), "Welcome to people", Toast.LENGTH_SHORT).show());
    }
}