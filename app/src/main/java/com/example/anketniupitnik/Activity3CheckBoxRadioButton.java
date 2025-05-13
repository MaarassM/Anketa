package com.example.anketniupitnik;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class Activity3CheckBoxRadioButton extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_check_box_radio_button);

        CheckBox cbSport = findViewById(R.id.cbSport);
        CheckBox cbMusic = findViewById(R.id.cbMusic);
        RadioButton rbMale = findViewById(R.id.rbMale);
        RadioButton rbFemale = findViewById(R.id.rbFemale);
        Button btnNext = findViewById(R.id.btnNext3);

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Activity3CheckBoxRadioButton.this, Activity4DatePicker.class);
            intent.putExtra("sport", cbSport.isChecked());
            intent.putExtra("music", cbMusic.isChecked());
            intent.putExtra("gender", rbMale.isChecked() ? "Male" : "Female");
            startActivity(intent);
        });
    }
}
