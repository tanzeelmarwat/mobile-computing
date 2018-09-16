package com.tanzeelmarwat.mobilecomputing;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tvHelloWorld;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mContext = this;
        tvHelloWorld = findViewById(R.id.tv_hello_world);
        tvHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Text View Hello World Click Listener
                Intent intent = new Intent(mContext, UniversityActivity.class);
                intent.putExtra("message", "I am coming from home");
                startActivity(intent);
            }
        });
    }
}
