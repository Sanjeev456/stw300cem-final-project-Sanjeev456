package com.example.acos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etname,etpassword;
    private Button btnlogin;
    private TextView tvinfo;
    private int counter=5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname=findViewById(R.id.etname);
        etpassword=findViewById(R.id.etpassword);
        btnlogin=findViewById(R.id.btnlogin);
        tvinfo=findViewById(R.id.tvinfo);

        tvinfo.setText("Number of attempts remaining:5");

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(etname.getText().toString(),etpassword.getText().toString());
            }
        });
    }
     private void validate(String username,String userpassword){
        if((username.equals("sanjeev")) && (userpassword.equals("1234"))){
            Intent intent=new Intent(MainActivity.this,Login.class);
            startActivity(intent);
        }
        else{
    counter--;

    tvinfo.setText("Number of attempts remaining:"+String.valueOf(counter));

    if(counter==0){
        btnlogin.setEnabled(false);
    }
        }
     }
}
