package com.google.www.register_form;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtname;
    EditText edtfamily;
    EditText edtpass;
    TextView txtshow;
    Button btnreg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname=(EditText)findViewById(R.id.edtname);
        edtfamily=(EditText)findViewById(R.id.edtfamily);
        edtpass=(EditText)findViewById(R.id.edtpass);
        txtshow=(TextView)findViewById(R.id.txtshow);
        btnreg=(Button)findViewById(R.id.btnreg);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                 String name=edtname.getText().toString();
               String family= edtfamily.getText().toString();
               txtshow.setText(name+"  "+family);
               edtname.setText("");
               edtfamily.setText("");
               edtpass.setText("");


            }
        });

    }
}
