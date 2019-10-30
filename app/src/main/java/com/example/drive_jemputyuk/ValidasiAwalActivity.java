package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ValidasiAwalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasiawal);
    }

    public void buttonValidasi1(View view) {
        Intent a = new Intent(ValidasiAwalActivity.this,PilihValidasi1Activity.class);
        startActivity(a);
    }

    public void buttonValidasi2(View view) {
        Intent b = new Intent(ValidasiAwalActivity.this,PilihValidasi2Activity.class);
        startActivity(b);
    }

    public void buttonValidasi3(View view) {
        Intent c = new Intent(ValidasiAwalActivity.this,PilihValidasi3Activity.class);
        startActivity(c);
    }

    public void buttonValidasi4(View view) {
        Intent d = new Intent(ValidasiAwalActivity.this,PilihValidasi4Activity.class);
        startActivity(d);
    }

    public void buttonValidasi5(View view) {
        Intent e = new Intent(ValidasiAwalActivity.this,PilihValidasi5Activity.class);
        startActivity(e);
    }
}
