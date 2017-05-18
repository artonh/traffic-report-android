package com.example.abidat.trafficmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Opsione extends AppCompatActivity {

    Button btnSave, btnDefault;
    EditText etKohaMaximaleAutoDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opsione);

        btnSave=(Button)findViewById(R.id.btnSave);
        btnDefault=(Button)findViewById(R.id.btnDefault);
        etKohaMaximaleAutoDelete = (EditText) findViewById(R.id.etKohaMaximaleAutoDelete);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parameters.MinutatSkadues=Integer.valueOf(etKohaMaximaleAutoDelete.getText().toString());

            }
        });
        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parameters.MinutatSkadues=5;
                //mund edhe te shfaqim nje njoftim se ju caktuat Default :5
            }
        });
    }
}
