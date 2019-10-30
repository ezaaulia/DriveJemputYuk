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

public class NoVirtual3Activity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novirtual3);

        text = findViewById(R.id.tv_nmrbank3);
    }

    public void buttonCopy3(View view) {

        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("ViewText", text.getText().toString());
        clipboard.setPrimaryClip(clip);

        clip.getDescription();

        Toast.makeText(NoVirtual3Activity.this, "Copied", Toast.LENGTH_SHORT).show();
    }
}
