// MainActivity.java
package com.example.anketniupitnik;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btnPocetak);
        btnStart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity1TextEdit.class);
            startActivity(intent);
        });
    }
}
