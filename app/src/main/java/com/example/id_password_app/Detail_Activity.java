package com.example.id_password_app;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.telecom.Call;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class Detail_Activity extends AppCompatActivity {

    TextView welcommessage;
    Button logout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);

        String id = getIntent().getStringExtra("id");
        String pw = getIntent().getStringExtra("pw");

        Log.d("login_detail","id="+id+"pw="+pw);

        welcommessage=findViewById(R.id.textView_welcome);
        welcommessage.setText("WELCOME "+id);


        logout=findViewById(R.id.button_logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
