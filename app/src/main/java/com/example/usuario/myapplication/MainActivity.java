package com.example.usuario.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button siguiente;

            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


            siguiente = (Button)findViewById(R.id.button2);
                siguiente.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this , InfoActivity.class);
                        startActivity(siguiente);
                    }
                });

        }
            }

