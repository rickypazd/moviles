package com.example.ricardopazdemiquel.moviles;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

<<<<<<< HEAD
public class cobranza extends AppCompatActivity {
    private TextView tv_total;
=======


>>>>>>> c9d968d0ba4d3df071a4737bd53cfe3c9d765c7f
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobranza);
        tv_total=findViewById(R.id.tv_total);
        SharedPreferences preferencias = getSharedPreferences("myPref",MODE_PRIVATE);
        String carrera = preferencias.getString("carrera", "");
        if(carrera.length()>0){
            try {
                JSONObject obj = new JSONObject(carrera);
                tv_total.setText(obj.getInt("costo_final")+" Bs.");
            } catch (JSONException e) {
                e.printStackTrace();

            }
        }else{

        }

        }
    }

