package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PilihValidasi4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihvalidasi4);
    }

    public void buttonChat4(View view) {
        Intent a = new Intent(PilihValidasi4Activity.this,HomeActivity.class);
        startActivity(a);
    }

    public void buttonSelesai(View view) {
        Intent b = new Intent(PilihValidasi4Activity.this,HomeActivity.class);
        startActivity(b);

        Toast.makeText(getApplicationContext(), "Selamat! Anda telah menyelesaikan bokingan ini!",
                Toast.LENGTH_SHORT).show();
    }
}
