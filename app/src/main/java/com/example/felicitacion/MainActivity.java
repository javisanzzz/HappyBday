package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"HappyBirthday-Regular.ttf");
        TextView titulo = findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.feliz_cumple);
        mediaPlayer.start();
    }
}