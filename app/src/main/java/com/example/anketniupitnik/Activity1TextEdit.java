package com.example.anketniupitnik;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Activity1TextEdit extends AppCompatActivity {
    EditText etIme, etPrezime, etEmail, etLozinka;
    Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_text_edit);

        etIme = findViewById(R.id.etIme);
        etPrezime = findViewById(R.id.etPrezime);
        btnNext1 = findViewById(R.id.btnNext1);

        btnNext1.setOnClickListener(v -> {
            Intent intent = new Intent(Activity1TextEdit.this, Activity2NumericEditText.class);
            intent.putExtra("ime", etIme.getText().toString());
            intent.putExtra("prezime", etPrezime.getText().toString());
            startActivity(intent);
        });
    }
}
