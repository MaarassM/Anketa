package com.example.anketniupitnik;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Activity2NumericEditText extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_numeric_edit_text);

        EditText etAge = findViewById(R.id.etAge);
        Button btnNext = findViewById(R.id.btnNext2);

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Activity2NumericEditText.this, Activity3CheckBoxRadioButton.class);
            intent.putExtra("age", etAge.getText().toString());
            startActivity(intent);
        });
    }
}
