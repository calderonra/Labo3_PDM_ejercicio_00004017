package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView mName,mLastName,mEmail,mUni;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mName=findViewById(R.id.tv_name);
        mLastName=findViewById(R.id.tv_lastName);
        mEmail=findViewById(R.id.tv_Email);
        mUni=findViewById(R.id.tv_Uni);
        mShare=findViewById(R.id.btn_share);

        Intent mIntent= getIntent();

        mName.setText(mIntent.getStringExtra(AppConstant.NOMBRE_KEY));
        mLastName.setText(mIntent.getStringExtra(AppConstant.APELLIDO_KEY));
        mEmail.setText(mIntent.getStringExtra(AppConstant.CORREO_KEY));
        mUni.setText(mIntent.getStringExtra(AppConstant.UNI_KEY));

        mShare.setOnClickListener(v->{
            String Name= mName.getText().toString();
            String LastName= mLastName.getText().toString();
            String Email= mEmail.getText().toString();
            String Uni = mUni.getText().toString();


            Intent newIntent= new Intent();
            newIntent.setType("text/plain");
            newIntent.setAction(Intent.ACTION_SEND);
            newIntent.putExtra(AppConstant.NOMBRE_KEY, Name);
            newIntent.putExtra(AppConstant.APELLIDO_KEY, LastName);
            newIntent.putExtra(AppConstant.CORREO_KEY, Email);
            newIntent.putExtra(AppConstant.UNI_KEY, Uni);

            startActivity(newIntent);


        });



    }
}
