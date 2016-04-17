package com.dyangalih.androidkejar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            mengambil object dari xml
         */
        final TextView tv_hello = (TextView) findViewById(R.id.tv_hello);
        Button btn_ganti = (Button) findViewById(R.id.btn_ganti);
        final EditText et_ganti_nama = (EditText) findViewById(R.id.et_text_ganti);

        /*
            memberikan perintah tombol ganti sesuai yang di input di edit text nya.
         */

        btn_ganti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_hello.setText(et_ganti_nama.getText());
            }
        });
    }
}
