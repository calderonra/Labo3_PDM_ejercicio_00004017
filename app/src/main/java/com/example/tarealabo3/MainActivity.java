package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mName,mLastName,mEmail,mUni;
    private Button mSubmmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName=findViewById(R.id.et_name);
        mLastName=findViewById(R.id.et_apellido);
        mEmail=findViewById(R.id.et_correo);
        mUni=findViewById(R.id.et_uni);
        mSubmmit=findViewById(R.id.btn_send);

        mSubmmit.setOnClickListener(v->{
            String Name=mName.getText().toString();
            String LastName= mLastName.getText().toString();
            String Email= mEmail.getText().toString();
            String Uni = mUni.getText().toString();
            Intent mIntent= new Intent(this, Main2Activity.class);
            mIntent.putExtra(AppConstant.NOMBRE_KEY, Name);
            mIntent.putExtra(AppConstant.APELLIDO_KEY, LastName);
            mIntent.putExtra(AppConstant.CORREO_KEY, Email);
            mIntent.putExtra(AppConstant.UNI_KEY, Uni);
            startActivity(mIntent);




        });




    }
}
