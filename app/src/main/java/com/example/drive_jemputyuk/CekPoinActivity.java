package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CekPoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cekpoin);
    }

    public void buttonPoin1(View view) {
        Intent a = new Intent(CekPoinActivity.this,PilihBankActivity.class);
        startActivity(a);
    }

    public void buttonPoin2(View view) {
        Intent b = new Intent(CekPoinActivity.this,PilihBankActivity.class);
        startActivity(b);
    }

    public void buttonPoin3(View view) {
        Intent c = new Intent(CekPoinActivity.this,PilihBankActivity.class);
        startActivity(c);
    }

    public void buttonBPoin4(View view) {
        Intent d = new Intent(CekPoinActivity.this,PilihBankActivity.class);
        startActivity(d);
    }

    public void buttonPoin5(View view) {
        Intent e = new Intent(CekPoinActivity.this,PilihBankActivity.class);
        startActivity(e);
    }

    public void buttonPoin6(View view) {
        Intent f = new Intent(CekPoinActivity.this,PilihBankActivity.class);
        startActivity(f);
    }
}
