package com.example.beer.testmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //ประกาศตัวแปรนะจ๊ะ
    Button buttonTod,buttonTom,buttonPad, buttonSteam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //เชื่อม UI
        buttonTod = (Button) findViewById(R.id.button);
        buttonTom = (Button) findViewById(R.id.button2);
        buttonPad = (Button) findViewById(R.id.button3);
        buttonSteam = (Button) findViewById(R.id.button4);

        //setOnClick
        buttonTod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MenuTod.class);
                startActivity(intent);

            }
        });

        buttonTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MenuTom.class);
                startActivity(intent);
            }
        });

        buttonPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MenuPad.class);
                startActivity(intent);
            }
        });

        buttonSteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MenuSteam.class);
                startActivity(intent);
            }
        });

    }//main method
}//main class
