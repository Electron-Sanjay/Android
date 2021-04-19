package com.example.sanjay.tipcalculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    double bill;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickrbtn(View view)
    {
        EditText editText = findViewById(R.id.costofservice);
        double amount = Double.parseDouble(editText.getText().toString());
        RadioButton amazing = findViewById(R.id.twentypercent);
        RadioButton good = findViewById(R.id.eighteenpercent);
        RadioButton okay = findViewById(R.id.fiteenpercent);
        TextView tip = findViewById(R.id.tipamt);
        boolean checked = ((RadioButton) view).isChecked();
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (view.getId()){
                    case R.id.twentypercent:
                        if (checked)
                            bill = (amount + (amount*.20));
                            tip.setText("$"+bill);
                        break;
                    case R.id.eighteenpercent:
                        if (checked)
                            bill = (amount + (amount*.18));
                        tip.setText("$"+" "+bill);
                        break;
                    case R.id.fiteenpercent:
                        if (checked)
                            bill = (amount + (amount*.15));
                        tip.setText("$"+bill);
                        break;
                }
            }
        });
    }

}
