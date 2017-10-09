package com.example.administrator.hencoder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.hencoder.class1.Class1MainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_class1).setOnClickListener(this);
        findViewById(R.id.btn_class2).setOnClickListener(this);
        findViewById(R.id.btn_class3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_class1:
                startActivity(new Intent(this, Class1MainActivity.class));
                break;
            case R.id.btn_class2:
//                startActivity(new Intent(this,Class1MainActivity.class));
                break;
            case R.id.btn_class3:
                break;
        }
    }
}
