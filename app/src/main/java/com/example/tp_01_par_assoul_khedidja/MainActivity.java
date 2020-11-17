package com.example.tp_01_par_assoul_khedidja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_number;
    Button b_convert;
    TextView tv_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_number = (EditText) findViewById(R.id.et_number);
        b_convert = (Button) findViewById(R.id.b_convert);
        tv_result = (TextView) findViewById(R.id.tv_result);

        b_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dec = Integer.parseInt(et_number.getText().toString());
                String bin =Integer.toBinaryString(dec);
                String oct = Integer.toOctalString(dec);
                String hex = Integer.toHexString(dec);
                tv_result.setText("DEC :" +dec+"\n\n"+
                                  "BIN :" +bin+ "\n\n"+
                                  "OCT :"+oct+"\n\n"+
                                  "HEX :" +hex+ "\n\n" );

            }
        });
    }

}
