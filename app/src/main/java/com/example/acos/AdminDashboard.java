package com.example.acos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminDashboard extends AppCompatActivity {

    private Button btnadditem,btnupdateitem,btndeleteitem,btnorderlist,btnviewitem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
        btnadditem=findViewById(R.id.btnadditem);
        btnupdateitem=findViewById(R.id.btnupdateitem);
        btndeleteitem=findViewById(R.id.btndeleteitem);
        btnorderlist=findViewById(R.id.btnorderlist);
        btnviewitem=findViewById(R.id.btnviewitem);

        btnadditem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminDashboard.this, AddFoodActivity.class);
                startActivity(intent);
            }
        });

    }
}
