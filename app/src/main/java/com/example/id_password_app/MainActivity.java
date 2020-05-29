package com.example.id_password_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editTextid;
    EditText editTextpw;
    Button logButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextid=findViewById(R.id.editText_id);
        editTextpw=findViewById(R.id.editText_pw);
        logButton=findViewById(R.id.button_login);

        logButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String id=null;
                String pw=null;

                if(editTextid!=null&&editTextid.getText().toString() !=""){
                    id=editTextid.getText().toString();


                }
                if(editTextpw!=null&&editTextpw.getText().toString()!=""){
                    pw=editTextpw.getText().toString();
                }

                Log.d("login_check","id="+id+"pw="+pw);
                Intent intent=new Intent(MainActivity.this, Detail_Activity.class);
                intent.putExtra("id",id);
                intent.putExtra("pw",pw);
                startActivity(intent);
            }
        });
    }
}
