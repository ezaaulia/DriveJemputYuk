package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PilihBankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihbank);
    }

    public void buttonBank1(View view) {
        Intent a = new Intent(PilihBankActivity.this,NoVirtual1Activity.class);
        startActivity(a);
    }

    public void buttonBank2(View view) {
        Intent b = new Intent(PilihBankActivity.this,NoVirtual2Activity.class);
        startActivity(b);
    }

    public void buttonBank3(View view) {
        Intent c = new Intent(PilihBankActivity.this,NoVirtual3Activity.class);
        startActivity(c);
    }
}
