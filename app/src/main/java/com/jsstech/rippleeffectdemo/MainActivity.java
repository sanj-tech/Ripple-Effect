package com.jsstech.rippleeffectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button ripple_Bt;
TextView rippleTxt;
ImageView ripple_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ripple_Bt=findViewById(R.id.rippleButton);
        rippleTxt=findViewById(R.id.rippletxtV);
        ripple_image=findViewById(R.id.rippleImg);



        ripple_Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ripple effect on Button",Toast.LENGTH_SHORT).show();

            }
        });

        rippleTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ripple effect on TextView",Toast.LENGTH_SHORT).show();

            }
        });
        ripple_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ripple effect on Image",Toast.LENGTH_SHORT).show();


            }
        });
    }
}