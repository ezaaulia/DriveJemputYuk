package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BantuanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);
    }

    public void buttonketentuan(View view) {
        Intent a = new Intent(BantuanActivity.this,KetentuanActivity.class);
        startActivity(a);
    }

    public void buttonkcaratf(View view) {
        Intent b = new Intent(BantuanActivity.this,CaraTransferActivity.class);
        startActivity(b);
    }
}
