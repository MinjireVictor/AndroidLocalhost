package com.example.minjire.databaseexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DatabaseLogin extends AppCompatActivity {
    EditText Username,Password;
    Button Withdraw,Register;
    String login_name,login_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_login);
        Username=(EditText)findViewById(R.id.EtUsername);
        Password=(EditText)findViewById(R.id.EtPassword);
        Withdraw=(Button) findViewById(R.id.BtWithdraw);
        Register=(Button) findViewById(R.id.BtRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DatabaseLogin.this,DatabaseRegister.class);
                startActivity(intent);
            }
        });

    }
    public void userLogin(View view) {

        login_name=Username.getText().toString();
        login_password=Password.getText().toString();
        String method="login";
        BackgroundDbTask backGroundDbTask=new BackgroundDbTask(this);
        backGroundDbTask.execute(method,login_name,login_password);

    }
}
