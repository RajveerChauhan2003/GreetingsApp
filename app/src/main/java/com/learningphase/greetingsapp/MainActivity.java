package com.learningphase.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.appHeading);
        button = findViewById(R.id.greetButton);
        editText = findViewById(R.id.nameInput);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Konnichiwa "+name+" !!", Toast.LENGTH_LONG).show();
            }
        });
    }
}