package com.example.fanindaputri.pengajuancuti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Calendar;


public class CutiTahunanIjinActivity extends AppCompatActivity implements View.OnClickListener {
    Button bsimpan;
    EditText eNomor, eID, eJumlah, eTanggal, eMulai, eAkhir, eKeperluan, eTempat, eTelp, ePelimpahan;
    TextView thasil;
    RadioGroup rgjk;


    private EditText tanggal, tanggalmulai, tanggalakhir;
    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuti_tahunan_ijin);

        tanggal = (EditText) findViewById(R.id.tanggal);
        tanggalmulai = (EditText) findViewById(R.id.tanggalmulai);
        tanggalakhir = (EditText) findViewById(R.id.tanggalakhir);

        tanggal.setOnClickListener(this);
        tanggalmulai.setOnClickListener(this);
        tanggalakhir.setOnClickListener(this);


        // inisialisasi

        bsimpan = (Button) findViewById(R.id.simpan);
        eNomor = (EditText) findViewById(R.id.isiNomor);
        eTanggal = (EditText) findViewById(R.id.tanggal);
        eID = (EditText) findViewById(R.id.isiID);
        thasil = (TextView) findViewById(R.id.hasil);
        rgjk = (RadioGroup) findViewById(R.id.jk);
        eJumlah = (EditText) findViewById(R.id.Jumlah);
        eMulai = (EditText) findViewById(R.id.tanggalmulai);
        eAkhir = (EditText) findViewById(R.id.tanggalakhir);
        eKeperluan = (EditText) findViewById(R.id.Keperluan);
        eTempat = (EditText) findViewById(R.id.Tempat);
        eTelp = (EditText) findViewById(R.id.Telp);
        ePelimpahan = (EditText) findViewById(R.id.Pelimpahan);


        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNomor = String.valueOf(eNomor.getText().toString());
                String inputTanggal = String.valueOf(eTanggal.getText().toString());
                String inputID = String.valueOf(eID.getText().toString());
                String inputJumlah = String.valueOf(eJumlah.getText().toString());
                String inputMulai = String.valueOf(eMulai.getText().toString());
                String inputAkhir = String.valueOf(eAkhir.getText().toString());
                String inputKeperluan = String.valueOf(eKeperluan.getText().toString());
                String inputTempat = String.valueOf(eTempat.getText().toString());
                String inputTelp = String.valueOf(eTelp.getText().toString());
                String inputPelimpahan = String.valueOf(ePelimpahan.getText().toString());

                int gender = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                String inputjk = String.valueOf(jk.getText().toString());

                thasil.setText("\n" +
                        "Nomor\t\t\t\t\t\t: " + inputNomor + "\n" +
                        "Tanggal\t\t\t\t\t\t: " + inputTanggal + "\n" +
                        "Personal ID\t\t\t\t: " + inputID + "\n" +
                        "Jenis Kelamin\t\t\t: " + inputjk + "\n" +
                        "Jumlah Hari  \t\t\t: " + inputJumlah + "\n" +
                        "Dari Tanggal \t\t\t: " + inputMulai + "\n" +
                        "Sampai Tanggal \t\t: " + inputAkhir + "\n" +
                        "Keperluan\t\t\t\t\t: " + inputKeperluan + "\n" +
                        "Tempat\t\t\t\t\t\t: " + inputTempat + "\n" +
                        "Telepone \t\t\t\t\t: " + inputTelp + "\n"+
                        "Pelimpahan \t\t\t\t: " + inputPelimpahan + "\n");



            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tanggal:
                showDatePicker((datePicker, y, m, d) -> tanggal.setText(d + "-" + (m + 1) + "-" + y));
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