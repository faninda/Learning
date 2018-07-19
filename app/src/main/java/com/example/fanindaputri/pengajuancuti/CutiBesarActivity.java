package com.example.fanindaputri.pengajuancuti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class CutiBesarActivity extends AppCompatActivity implements View.OnClickListener {

    Button bsimpan;
    EditText eNIP, etanggalmulai1, etanggalakhir1, eKeperluan1, eMulai, etgl_akhir2, eKeperluan2, eTempat, eTelp;
    TextView ttahap1, ttahap2, thasil;


    private EditText tanggalmulai1, tanggalakhir1, tanggalmulai, tanggalakhir;
    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuti_besar);

        tanggalmulai1 = (EditText) findViewById(R.id.tanggalmulai1);
        tanggalakhir1 = (EditText) findViewById(R.id.tanggalakhir1);
        tanggalmulai= (EditText) findViewById(R.id.tanggalmulai);
        tanggalakhir = (EditText) findViewById(R.id.tanggalakhir);

        tanggalmulai1.setOnClickListener(this);
        tanggalakhir1.setOnClickListener(this);
        tanggalmulai.setOnClickListener(this);
        tanggalakhir.setOnClickListener(this);


        bsimpan = (Button) findViewById(R.id.simpan);
        eNIP = (EditText) findViewById(R.id.isiNIP);
        ttahap1 = (TextView) findViewById(R.id.tahap1);
        etanggalmulai1 = (EditText) findViewById(R.id.tanggalmulai1);
        etanggalakhir1 = (EditText) findViewById(R.id.tanggalakhir1);
        eKeperluan1 = (EditText) findViewById(R.id.Keperluan1);
        thasil = (TextView) findViewById(R.id.hasil);
        ttahap2 = (TextView) findViewById(R.id.tahap2);
        eMulai = (EditText) findViewById(R.id.tanggalmulai);
        etgl_akhir2 = (EditText) findViewById(R.id.tanggalakhir);
        eKeperluan2 = (EditText) findViewById(R.id.Keperluan2);
        eTempat = (EditText) findViewById(R.id.Tempat);
        eTelp = (EditText) findViewById(R.id.Telp);


        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNIP = String.valueOf(eNIP.getText().toString());
                String inputTanggal_Mulai = String.valueOf(etanggalmulai1.getText().toString());
                String inputtgl_akhir1 = String.valueOf(etanggalakhir1.getText().toString());
                String inputKeperluan1 = String.valueOf(eKeperluan1.getText().toString());
                String inputMulai = String.valueOf(eMulai.getText().toString());
                String inputtgl_akhir2 = String.valueOf(etgl_akhir2.getText().toString());
                String inputKeperluan2 = String.valueOf(eKeperluan2.getText().toString());
                String inputTempat = String.valueOf(eTempat.getText().toString());
                String inputTelp = String.valueOf(eTelp.getText().toString());


                thasil.setText("\n" +
                        "NIP  \t\t\t\t\t\t\t\t: " + inputNIP + "\n" +
                        "Tanggal Mulai\t\t\t: " + inputTanggal_Mulai + "\n" +
                        "Tanggal Akhir\t\t\t: " + inputtgl_akhir1 + "\n" +
                        "Keperluan  \t\t\t\t: " + inputKeperluan1 + "\n" +
                        "Tanggal Mulai\t\t\t: " + inputMulai + "\n" +
                        "Tanggal akhir  \t\t: " + inputtgl_akhir2 + "\n" +
                        "Keperluan\t\t\t\t\t: " + inputKeperluan2 + "\n" +
                        "Tempat \t\t\t\t\t\t: " + inputTempat + "\n" +
                        "Telepone \t\t\t\t\t: " + inputTelp + "\n");
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tanggalmulai1:
                showDatePicker((datePicker, y, m, d) -> tanggalmulai1.setText(d + "-" + (m + 1) + "-" + y));
                break;

            case R.id.tanggalakhir1:
                showDatePicker((datePicker, y, m, d) -> tanggalakhir1.setText(d + "-" + (m + 1) + "-" + y));
                break;

            case R.id.tanggalmulai:
                showDatePicker((datePicker, y, m, d) -> tanggalmulai.setText(d + "-" + (m + 1) + "-" + y));
                break;


            case R.id.tanggalakhir:
                showDatePicker((datePicker, y, m, d) -> tanggalakhir.setText(d + "-" + (m + 1) + "-" + y));
                break;

        }
    }

    private void showDatePicker(DatePickerDialog.OnDateSetListener listener) {
        Calendar a = Calendar.getInstance();
        mYear = a.get(Calendar.YEAR);
        mMonth = a.get(Calendar.MONTH);
        mDay = a.get(Calendar.DAY_OF_MONTH);

        new DatePickerDialog(this, listener, mYear, mMonth, mDay).show();
    }

}


