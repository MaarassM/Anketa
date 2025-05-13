package com.example.anketniupitnik;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EndActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        TextView tvPrikaz = findViewById(R.id.tvPrikaz);

        String ime = getIntent().getStringExtra("ime");
        String prezime = getIntent().getStringExtra("prezime");
        String age = getIntent().getStringExtra("age");

        tvPrikaz.setText("Ime: " + ime + "\nPrezime: " + prezime + "\nGodine: " + age);
    }
}
