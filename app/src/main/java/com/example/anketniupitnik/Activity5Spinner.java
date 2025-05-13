package com.example.anketniupitnik;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Activity5Spinner extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_spinner);

        Spinner spinner = findViewById(R.id.spinnerEducation);
        Button btnNext = findViewById(R.id.btnNext5);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.education_levels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Activity5Spinner.this, EndActivity.class);
            intent.putExtra("education", spinner.getSelectedItem().toString());
            startActivity(intent);
        });
    }
}
