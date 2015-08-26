package com.mobiledev.lab_2_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button computButton = (Button) findViewById(R.id.computeButton);
        computButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputText = (EditText) findViewById(R.id.inputText);
                TextView outputText =  (TextView) findViewById(R.id.outputText);
                String inputStr = inputText.getText().toString();
                int inputNumber = Integer.parseInt(inputStr);
                if(IsPrime(inputNumber))
                    outputText.setText(inputStr + " is prime");
                else
                    outputText.setText(inputStr + " is not prime");
            }
        });

    }

    private Boolean IsPrime(int num){
        for (int i = 2; i < num; i++)
            if(num % i == 0)
                return false;

        return true;


    }
}
