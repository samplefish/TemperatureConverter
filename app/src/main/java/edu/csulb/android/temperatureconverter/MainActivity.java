package edu.csulb.android.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText1);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button1:
                RadioButton celciusButton = (RadioButton) findViewById(R.id.radioButton0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radioButton1);
                if(text.getText().length() == 0)
                {
                    Toast.makeText(this, "Please enter a valid number.", Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (celciusButton.isChecked())
                {
                    text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelcius(inputValue)));
                    celciusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                }
                else
                {
                    text.setText(String.valueOf(ConverterUtil.convertCelciusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celciusButton.setChecked(true);
                }
                break;
        }
    }
}