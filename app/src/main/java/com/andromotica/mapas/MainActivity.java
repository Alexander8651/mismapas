package com.andromotica.mapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void abrirPueblitoPaisa(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        LatLng publitpoPaisa = new LatLng(6.236335, -75.580259);
        intent.putExtra("lat", publitpoPaisa.latitude);
        intent.putExtra("lng", publitpoPaisa.longitude);
        intent.putExtra("title", "Pueblito Paisa");
        intent.putExtra("icono", R.drawable.pueblitopaisa);
        startActivity(intent);
    }

    public void abrirMuseoAntioquia(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        LatLng publitpoPaisa = new LatLng(6.252553, -75.568985);
        intent.putExtra("lat", publitpoPaisa.latitude);
        intent.putExtra("lng", publitpoPaisa.longitude);
        intent.putExtra("title", "Museo de antioquia");
        intent.putExtra("icono", R.drawable.museoantioquia);
        startActivity(intent);
    }

    public void abrirParqueBotero(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        LatLng publitpoPaisa = new LatLng(6.252352, -75.568176);
        intent.putExtra("lat", publitpoPaisa.latitude);
        intent.putExtra("lng", publitpoPaisa.longitude);
        intent.putExtra("title", "Pueblito Paisa");
        intent.putExtra("icono", R.drawable.parquebotero);
        startActivity(intent);
    }
    public void abrirParquesDelRio(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        LatLng publitpoPaisa = new LatLng(6.243610, -75.579529);
        intent.putExtra("lat", publitpoPaisa.latitude);
        intent.putExtra("lng", publitpoPaisa.longitude);
        intent.putExtra("title", "Pueblito Paisa");
        intent.putExtra("icono", R.drawable.parquesdelrio);
        startActivity(intent);
    }
}