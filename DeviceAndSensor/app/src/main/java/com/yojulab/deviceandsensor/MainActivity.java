package com.yojulab.deviceandsensor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View buttonSensorList = findViewById(R.id.buttonSensorList);
        View buttonPedometer = findViewById(R.id.buttonPedometer);

        buttonSensorList.setOnClickListener(this);
        buttonPedometer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent = null;
        String text = ((Button) view).getText().toString();
        Bundle bundle = new Bundle();
        Class<?> cls = null;
        switch (id) {
            case R.id.buttonSensorList:
                cls = SensorListActivity.class;
                break;
            case R.id.buttonPedometer:
                cls = PedometerActivity.class;
                break;
        }
        intent = new Intent(this, cls);
        startActivity(intent);
    }
}
