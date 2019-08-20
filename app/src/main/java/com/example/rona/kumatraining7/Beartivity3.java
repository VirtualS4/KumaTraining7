package com.example.rona.kumatraining7;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Beartivity3 extends AppCompatActivity {

    Handler bearhand;
    Runnable bearun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity3);
        Bundle bearbun = getIntent().getExtras();
        Bear kumayuru = bearbun.getParcelable("Bear");
        ((TextView)findViewById(R.id.tx_nama)).setText(kumayuru.getName());
        ((TextView)findViewById(R.id.tx_alamat)).setText(kumayuru.getAlamat());
        ((TextView)findViewById(R.id.tx_pesan)).setText(kumayuru.getPesanan());
        bearun = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext() , Beartivity.class));
            }
        };
        bearhand = new Handler();
        bearhand.postDelayed(bearun, 2000);
    }
}
