package com.example.labo2_ejer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imagen1 = findViewById(R.id.imagen1);

        imagen2 = findViewById(R.id.imagen2);

        imagen3 = findViewById(R.id.imagen3);

        imagen4 = findViewById(R.id.imagen4);

        imagen5 = findViewById(R.id.imagen5);

        imagen6 = findViewById(R.id.imagen6);

        imagen7 = findViewById(R.id.imagen7);

        imagen8 = findViewById(R.id.imagen8);

        imagen9 = findViewById(R.id.imagen9);



        imagen1.setOnClickListener(this);

        imagen2.setOnClickListener(this);

        imagen3.setOnClickListener(this);

        imagen4.setOnClickListener(this);

        imagen5.setOnClickListener(this);

        imagen6.setOnClickListener(this);

        imagen7.setOnClickListener(this);

        imagen8.setOnClickListener(this);

        imagen9.setOnClickListener(this);

    }


    @Override

    public void onClick(View v) {

        int [] ArrayImagenes = {R.drawable.imagen1, R.drawable.imagen2, R.drawable.imagen3, R.drawable.imagen4, R.drawable.imagen5, R.drawable.imagen1, R.drawable.imagen2, R.drawable.imagen3

                ,R.drawable.imagen4};

        int viewId = v.getId();



        switch (viewId){

            case R.id.imagen1:{

                imagen1.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen2:{

                imagen2.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen3:{

                imagen3.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen4:{

                imagen4.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen5:{

                imagen5.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen6:{

                imagen6.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen7:{

                imagen7.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen8:{

                imagen8.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

            case R.id.imagen9:{

                imagen9.setImageResource(ArrayImagenes[(int) Math.floor(Math.random()*9)]);

                break;

            }

        }



    }

}
