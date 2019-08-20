package com.example.rona.kumatraining7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Beartivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity2);

        Button btnorder = findViewById(R.id.btn_order);
        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(getApplicationContext(),Beartivity3.class);
                Bear kumayuru = new Bear();
                kumayuru.setName(((EditText) findViewById(R.id.txt_nama)).getText().toString());
                kumayuru.setAlamat(((EditText) findViewById(R.id.txt_alamat)).getText().toString());
                kumayuru.setPesanan(((EditText) findViewById(R.id.txt_pesan)).getText().toString());

                bearsense.putExtra("Bear",kumayuru);
                startActivity(bearsense);
            }
        });
    }
}
