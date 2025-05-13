package com.example.anketniupitnik;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import java.util.Calendar;

public class Activity4DatePicker extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4_date_picker);

        TextView tvDate = findViewById(R.id.tvDate);
        Button btnNext = findViewById(R.id.btnNext4);

        tvDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
                String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                tvDate.setText(date);
            }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Activity4DatePicker.this, Activity5Spinner.class);
            intent.putExtra("date", tvDate.getText().toString());
            startActivity(intent);
        });
    }
}
