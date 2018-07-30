package com.example.fanindaputri.pengajuancuti.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fanindaputri.pengajuancuti.R;

public class MenuCutiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menucuti );

    }


    public void kotak1 (View view) {
        Intent intent = new Intent(MenuCutiActivity.this,CutiTahunanIjinActivity.class);
        startActivity(intent);
    }

    public void kotak2 (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiHamilActivity.class);
        startActivity(intent);
    }

    public void kotak3 (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiBesarActivity.class);
        startActivity(intent);
    }
}
