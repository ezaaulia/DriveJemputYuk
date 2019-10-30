package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void buttonCekpoin(View view) {
        Intent a = new Intent(HomeActivity.this,CekPoinActivity.class);
        startActivity(a);
    }

    public void buttonValidasi(View view) {
        Intent b = new Intent(HomeActivity.this,ValidasiAwalActivity.class);
        startActivity(b);
    }

    public void buttonNotifikasi(View view) {
        Intent c = new Intent(HomeActivity.this,NotifikasiActivity.class);
        startActivity(c);
    }

    public void buttonPengingat(View view) {
        Intent d = new Intent(HomeActivity.this,PengingatActivity.class);
        startActivity(d);
    }

    public void buttonAkunsaya(View view) {
        Intent e = new Intent(HomeActivity.this,AkunSayaActivity.class);
        startActivity(e);
    }

    public void buttonBantuan(View view) {
        Intent f = new Intent(HomeActivity.this,BantuanActivity.class);
        startActivity(f);
    }
}
