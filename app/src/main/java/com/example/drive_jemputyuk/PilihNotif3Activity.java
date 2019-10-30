package com.example.drive_jemputyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PilihNotif3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihnotif3);
    }

    public void buttonTolak(View view) {

        Toast.makeText(getApplicationContext(), "Anda berhasil menolak bokingan ini!",
                Toast.LENGTH_SHORT).show();
    }

    public void buttonTerima(View view) {

        Toast.makeText(getApplicationContext(), "Anda berhasil menerima bokingan ini!",
                Toast.LENGTH_SHORT).show();
    }
}
