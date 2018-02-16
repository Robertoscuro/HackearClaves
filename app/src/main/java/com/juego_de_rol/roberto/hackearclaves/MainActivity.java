package com.juego_de_rol.roberto.hackearclaves;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView r,r2,r1;
    private ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // i.setImageIcon();
        r=(TextView)findViewById(R.id.resultado);

        }

        public void iniciar(View view){
                String s;
                hackeo hack = new hackeo();
                s=hack.hackear();
                r.setText(s);

        }
}
