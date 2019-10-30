package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NoVirtual1Activity extends AppCompatActivity {

    TextView  text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novirtual1);

        text = findViewById(R.id.tv_nmrbank1);
    }

    public void buttonCopy1(View view) {

        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("ViewText", text.getText().toString());
        clipboard.setPrimaryClip(clip);

        clip.getDescription();

        Toast.makeText(NoVirtual1Activity.this, "Copied", Toast.LENGTH_SHORT).show();
    }
}
