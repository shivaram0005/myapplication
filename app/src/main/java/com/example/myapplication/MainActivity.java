package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button1); //type casting Button 1
        Button b2=(Button)findViewById(R.id.button2); //type casting Button 2
        Button b3=(Button)findViewById(R.id.button3); //type casting Button 3
        Button b4=(Button)findViewById(R.id.button4); //type casting Button 4
        b1.setOnClickListener(this); //refers to current class
        b2.setOnClickListener(this); //refers to current class
        b3.setOnClickListener(this); //refers to current class
        b4.setOnClickListener(this); //refers to current class


}

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button1:
                Toast.makeText(this, "Button 1 is pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "Button 2 is pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "Button 3 is pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "Button 4 is pressed", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}