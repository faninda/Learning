package com.example.fanindaputri.pengajuancuti.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fanindaputri.pengajuancuti.R;

import java.util.Calendar;


public class CutiTahunanIjinActivity extends AppCompatActivity implements View.OnClickListener {
    Button bsimpan;
    EditText eNomor, eID, eJumlah, eTanggal, eMulai, eAkhir, eKeperluan, eTempat, eTelp, ePelimpahan;
    TextView thasil;


    private EditText tanggal, tanggalmulai, tanggalakhir;
    private int mYear, mMonth, mDay;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cuti_tahunan_ijin );

        tanggal = (EditText) findViewById( R.id.tanggal );
        tanggalmulai = (EditText) findViewById( R.id.tanggalmulai );
        tanggalakhir = (EditText) findViewById( R.id.tanggalakhir );


        tanggal.setOnClickListener( this );
        tanggalmulai.setOnClickListener( this );
        tanggalakhir.setOnClickListener( this );


        // inisialisasi

        bsimpan = (Button) findViewById( R.id.simpan );
        eNomor = (EditText) findViewById( R.id.isiNomor );
        eTanggal = (EditText) findViewById( R.id.tanggal );
        eID = (EditText) findViewById( R.id.isiID );
        thasil = (TextView) findViewById( R.id.hasil );
        eJumlah = (EditText) findViewById( R.id.Jumlah );
        eMulai = (EditText) findViewById( R.id.tanggalmulai );
        eAkhir = (EditText) findViewById( R.id.tanggalakhir );
        eKeperluan = (EditText) findViewById( R.id.Keperluan );
        eTempat = (EditText) findViewById( R.id.Tempat );
        eTelp = (EditText) findViewById( R.id.Telp );
        ePelimpahan = (EditText) findViewById( R.id.Pelimpahan );

        bsimpan.setOnClickListener( new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String inputNomor = String.valueOf( eNomor.getText().toString() );
                String inputTanggal = String.valueOf( eTanggal.getText().toString() );
                String inputID = String.valueOf( eID.getText().toString() );
                String inputJumlah = String.valueOf( eJumlah.getText().toString() );
                String inputMulai = String.valueOf( eMulai.getText().toString() );
                String inputAkhir = String.valueOf( eAkhir.getText().toString() );
                String inputKeperluan = String.valueOf( eKeperluan.getText().toString() );
                String inputTempat = String.valueOf( eTempat.getText().toString() );
                String inputTelp = String.valueOf( eTelp.getText().toString() );
                String inputPelimpahan = String.valueOf( ePelimpahan.getText().toString() );

                // jika id personal kosong dan panjang karakter =0 maka akan keluar error.
                if (TextUtils.isEmpty( eNomor.getText().toString() ) || eNomor.getText().toString().length() == 0) {
                    eNomor.setError( "Masukkan ID!" );
                    eNomor.requestFocus(); // kalau uda selesai pindah ke satunya validasinya

                }else if (TextUtils.isEmpty( eTanggal.getText().toString() )) {
                    eTanggal.setError( "Tanggal diperlukan!" );
                    eTanggal.requestFocus();

                }else if (TextUtils.isEmpty( eID.getText().toString() ) || eID.getText().toString().length() == 0) {
                    eTanggal.setError( null ); //untuk menghilangkan tanda merah pada validasi
                    eID.setError( "Masukkan ID!" );
                    eID.requestFocus();

                }else if (TextUtils.isEmpty( eJumlah.getText().toString() ) || eJumlah.getText().toString().length() == 0) {
                    eJumlah.setError( "Masukkan Jumlah Cuti!" );
                    eJumlah.requestFocus();

                }else if (TextUtils.isEmpty( eMulai.getText().toString() )) {
                    eMulai.setError( "Masukkan TGL Mulai Cuti!" );
                    eMulai.requestFocus();

                }else if (TextUtils.isEmpty( eAkhir.getText().toString() )) {
                    eMulai.setError( null );
                    eAkhir.setError( "Masukkan TGL Akhir Cuti!" );
                    eAkhir.requestFocus();

                }else if (TextUtils.isEmpty( eKeperluan.getText().toString() ) || eKeperluan.getText().toString().length() == 0) {
                    eAkhir.setError( null );
                    eKeperluan.setError( "Masukkan Keperluan!" );
                    eKeperluan.requestFocus();

                } else if (TextUtils.isEmpty( eTempat.getText().toString() ) || eTempat.getText().toString().length() == 0) {
                    eTempat.setError( "Masukkan Alamat!" );
                    eTempat.requestFocus();

                } else if (TextUtils.isEmpty( eTelp.getText().toString() ) || eTelp.getText().toString().length() == 0) {
                    eTelp.setError( "No Telephone diperlukan!" );
                    eTelp.requestFocus();

                } else if (TextUtils.isEmpty( ePelimpahan.getText().toString() ) || ePelimpahan.getText().toString().length() == 0) {
                    ePelimpahan.setError( "Masukkan Pelimpahan tugas!" );
                    ePelimpahan.requestFocus();

                } else {
                    //jika form sudah terisi semua
                    Toast.makeText( getApplicationContext(), "Registrasi Berhasil!",
                            Toast.LENGTH_SHORT ).show();

                    thasil.setText( "\n" +
                            "Nomor\t\t\t\t\t\t: " + inputNomor + "\n" +
                            "Tanggal\t\t\t\t\t\t: " + inputTanggal + "\n" +
                            "Personal ID\t\t\t\t: " + inputID + "\n" +
                            "Jumlah Hari  \t\t\t: " + inputJumlah + "\n" +
                            "Dari Tanggal \t\t\t: " + inputMulai + "\n" +
                            "Sampai Tanggal \t\t: " + inputAkhir + "\n" +
                            "Keperluan\t\t\t\t\t: " + inputKeperluan + "\n" +
                            "Tempat\t\t\t\t\t\t: " + inputTempat + "\n" +
                            "Telephone \t\t\t\t\t: " + inputTelp + "\n" +
                            "Pelimpahan \t\t\t\t: " + inputPelimpahan + "\n" );
                }
            }
        } );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tanggal:
                showDatePicker( (datePicker, y, m, d) -> tanggal.setText( d + "-" + (m + 1) + "-" + y ) );
                break;

            case R.id.tanggalmulai:
                showDatePicker( (datePicker, y, m, d) -> tanggalmulai.setText( d + "-" + (m + 1) + "-" + y ) );
                break;

            case R.id.tanggalakhir:
                showDatePicker( (datePicker, y, m, d) -> tanggalakhir.setText( d + "-" + (m + 1) + "-" + y ) );
                break;
        }
    }

    private void showDatePicker(DatePickerDialog.OnDateSetListener listener) {
        Calendar a = Calendar.getInstance();
        mYear = a.get( Calendar.YEAR );
        mMonth = a.get( Calendar.MONTH );
        mDay = a.get( Calendar.DAY_OF_MONTH );

        new DatePickerDialog( this, listener, mYear, mMonth, mDay ).show();

    }
}




