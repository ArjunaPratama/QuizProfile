package com.arjuna.quizprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget
    TextView txtnama, txtusernama, txtnis, txtmajor;
    EditText username, name, nis, major;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil data
        txtnama = (TextView) findViewById(R.id.txtname);
        txtusernama = (TextView) findViewById(R.id.txtusernama);
        txtnis = (TextView) findViewById(R.id.txtxnis);
        txtmajor = (TextView) findViewById(R.id.txtmajor);
        username = (EditText) findViewById(R.id.username);
        name = (EditText) findViewById(R.id.name);
        nis = (EditText) findViewById(R.id.nis);
        major = (EditText) findViewById(R.id.major);
        Submit = (Button) findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil String dari etnama dan etkelas
                String nuser = username.getText().toString();
                String nname = name.getText().toString();
                String nnis = nis.getText().toString();
                String nmajor = major.getText().toString();

                txtusernama.setText("UserName:" + nuser);
                txtnama.setText("Name:" + nname);
                txtnis.setText("Nis:" + nnis);
                txtmajor.setText("Major:" + nmajor);
            }
        });

    }
}
