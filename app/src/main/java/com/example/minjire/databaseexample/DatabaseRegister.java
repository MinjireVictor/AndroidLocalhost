package com.example.minjire.databaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DatabaseRegister extends AppCompatActivity {
    EditText Username,Password,Amount;
    Button Insert;
    String username,password,amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_register);

        setContentView(R.layout.activity_back_ground_db_task);
        Username=(EditText)findViewById(R.id.EtUsername);
        Password=(EditText)findViewById(R.id.EtPassword);
        Amount=(EditText)findViewById(R.id.EtAmount);
        Insert=(Button) findViewById(R.id.BtInsert);

    }
    public void userReg(View view) {
        username=Username.getText().toString();
        password=Password.getText().toString();
        amount=Amount.getText().toString();
        // pass info to backgroundtask
        String method="Register";
        BackgroundDbTask backGroundDbTask= new BackgroundDbTask(this);
        backGroundDbTask.execute(method,username,password,amount);


    }
}
