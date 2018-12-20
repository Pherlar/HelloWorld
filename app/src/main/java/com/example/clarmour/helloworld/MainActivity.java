package com.example.clarmour.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int counter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView countview = (TextView) findViewById(R.id.countText);
        countview.setText(Integer.toString(counter));
    }

    public void ToastClick(View view) {
        Toast message = Toast.makeText(this, R.string.ToastMessage, Toast.LENGTH_LONG);
        message.show();
    }

    public void addOne(View view) {
        counter++;
        TextView countview = (TextView) findViewById(R.id.countText);
        countview.setText(Integer.toString(counter));
    }

    public void Reset(View view) {
        counter = 10;
        TextView countview = (TextView) findViewById(R.id.countText);
        countview.setText(Integer.toString(counter));
    }
}
