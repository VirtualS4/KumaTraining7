package com.example.rona.kumatraining7;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class BearSplash extends AppCompatActivity {

    private Runnable bearun;
    private Handler bearhand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear_splash);
        bearun = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(BearSplash.this , Beartivity.class));
            }
        };
        bearhand = new Handler();
        bearhand.postDelayed(bearun, 1500);

    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if(bearhand !=null && bearun!=null){
//            bearhand.removeCallbacks(bearun);
//        }
//    }
}
