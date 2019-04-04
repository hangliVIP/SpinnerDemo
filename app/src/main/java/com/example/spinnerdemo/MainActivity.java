package com.example.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

import widget.MySpinner;

public class MainActivity extends AppCompatActivity {

    private View mRootView;
    private TextView mTView;
    private ImageButton mBtnDropDown;
    private MySpinner myspinner;
    String[] names;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }


    private void setupViews(){
        mRootView = findViewById(R.id.rootView);
        names = getResources().getStringArray(R.array.city_name);

        myspinner = (MySpinner) findViewById(R.id.myspinner);
        myspinner.setData(Arrays.asList(names));
        myspinner.setOnItemSelectedListener(new MySpinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(int var3) {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "你点击的是:"+names[var3], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
