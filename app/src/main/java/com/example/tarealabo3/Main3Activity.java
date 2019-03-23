package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView mName,mLastName,mEmail,mUni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mName=findViewById(R.id.tv_nameA3);
        mLastName=findViewById(R.id.tv_lastNameA3);
        mEmail=findViewById(R.id.tv_EmailA3);
        mUni=findViewById(R.id.tv_UniA3);

        Intent mIntent= this.getIntent();

        if(mIntent!=null) {
            mName.setText("Nombre: " + mIntent.getStringExtra(AppConstant.NOMBRE_KEY));
            mLastName.setText("Apellido: " + mIntent.getStringExtra(AppConstant.APELLIDO_KEY));
            mEmail.setText("Correo: " + mIntent.getStringExtra(AppConstant.CORREO_KEY));
            mUni.setText("Edad: " + mIntent.getStringExtra(AppConstant.UNI_KEY));
        }


    }
}
