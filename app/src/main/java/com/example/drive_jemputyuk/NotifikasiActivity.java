package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotifikasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);
    }

    public void buttonNotifikasi1(View view) {
        Intent a = new Intent(NotifikasiActivity.this,PilihNotif1Activity.class);
        startActivity(a);
    }

    public void buttonNotifikasi2(View view) {
        Intent b = new Intent(NotifikasiActivity.this,PilihNotif2Activity.class);
        startActivity(b);
    }

    public void buttonNotifikasi3(View view) {
        Intent c = new Intent(NotifikasiActivity.this,PilihNotif3Activity.class);
        startActivity(c);
    }

    public void buttonNotifikasi4(View view) {
        Intent d = new Intent(NotifikasiActivity.this,PilihNotif4Activity.class);
        startActivity(d);
    }

    public void buttonNotifikasi5(View view) {
        Intent e = new Intent(NotifikasiActivity.this,PilihNotif5Activity.class);
        startActivity(e);
    }
}
