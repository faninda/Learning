package com.example.fanindaputri.pengajuancuti.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fanindaputri.pengajuancuti.R;
import com.example.fanindaputri.pengajuancuti.recycleview.HistoryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


    }

    public void Cuti (View view) {
        Intent intent = new Intent(MainActivity.this, MenuCutiActivity.class);
        startActivity(intent);
    }

    public void History (View view) {
        Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
        startActivity(intent);
    }

}
