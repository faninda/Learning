package com.example.fanindaputri.pengajuancuti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuCutiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menucuti );

    }

    public void CutiTahunandanIjin (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiTahunanIjinActivity.class);
        startActivity(intent);
    }

    public void calendar (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiTahunanIjinActivity.class);
        startActivity(intent);
    }

    public void CutiHamil (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiHamilActivity.class);
        startActivity(intent);
    }

    public void pregnant (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiHamilActivity.class);
        startActivity(intent);
    }

    public void CutiBesar (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiBesarActivity.class);
        startActivity(intent);
    }

    public void happy (View view) {
        Intent intent = new Intent(MenuCutiActivity.this, CutiBesarActivity.class);
        startActivity(intent);
    }
}
