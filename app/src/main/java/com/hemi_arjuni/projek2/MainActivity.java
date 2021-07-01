package com.hemi_arjuni.projek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNama, edtNpm, edtJenisKelamin, edtNoHp, edtAlamat, edtProdi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmdanNama);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtJenisKelamin = (EditText) findViewById(R.id.edtJenisKelamin);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        edtNoHp = (EditText) findViewById(R.id.edtNoHp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String strings = edtNama.getText().toString();
                String strings = edtNpm.getText().toString();
                String strings = edtAlamat.getText().toString();
                String strings = edtJenisKelamin.getText().toString();
                String strings = edtProdi.getText().toString();
                String strings = edtNoHp.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "/" + strJenisKelamin + "\n" + strNoHp + "\n" + strAlamat + "\n" + strProdi);
            }
            }
    }
}