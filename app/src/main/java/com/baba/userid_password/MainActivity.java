package com.baba.userid_password;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText userid = findViewById(R.id.userid);
        final EditText password =findViewById(R.id.password);
        Button loginbtn = findViewById(R.id.buttonlogin);
        final String UserId= "ajaykaswna00@gmail.com";
        final String Pass = "98281828";

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = userid.getText().toString();
                String p = password.getText().toString();
                if (s==UserId){
                    if (p==Pass){
                        Toast.makeText(MainActivity.this,"Wel-Come",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Your Password is Wrong",Toast.LENGTH_LONG).show();

                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"Plese Enter valid UserId is ",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
