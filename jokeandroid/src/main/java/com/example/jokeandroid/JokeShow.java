package com.example.jokeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeShow extends AppCompatActivity {
    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_show);
        jokeText = (TextView)findViewById(R.id.jokeToShow);


        jokeText.setText(getIntent().getStringExtra("jokeString"));


    }
}
