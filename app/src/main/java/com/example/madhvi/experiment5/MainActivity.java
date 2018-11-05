package com.example.madhvi.experiment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox) findViewById(R.id.pizza);
        c2=(CheckBox)findViewById(R.id.chowmine);

        c3=(CheckBox)findViewById(R.id.Pizza);
        c4=(CheckBox)findViewById(R.id.hotdog);

        c5=(CheckBox)findViewById(R.id.pasta);
        c6=(CheckBox)findViewById(R.id.pasta);

        c7=(CheckBox)findViewById(R.id.sandwich);
        c8=(CheckBox)findViewById(R.id.pasta);

    }

    public void order(View view) {
        Toast.makeText(getApplicationContext(),"Your Order is Placed/nTotal price is :"+sum,Toast.LENGTH_LONG).show();
        sum=0;

    }

    public void burger(View view) {
        sum=sum+50;
    }

    public void chowmin(View view) {
        sum=sum+50;
    }

    public void pizza(View view) {
        sum=sum+99;
    }

    public void hotdog(View view) {
        sum=sum+70;
    }


    public void man(View view) {
        sum=sum+80;
    }

    public void pasta(View view) {
        sum=sum+60;
    }

    public void sand(View view) {
        sum=sum+60;
    }

    public void fries(View view) {
        sum=sum+50;
    }
}
