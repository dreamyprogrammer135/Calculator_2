package com.dreamyprogrammer.calculator_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int[] buttonNumIds;
    View.OnClickListener buttonNumClickListener;
    TextView textViewFull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setView();
    }

    private void findView() {
        textViewFull = findViewById(R.id.text_view_full);
        buttonNumIds = new int[]{
                R.id.button_1,
                R.id.button_2,
                R.id.button_3,
                R.id.button_4,
                R.id.button_5,
                R.id.button_6,
                R.id.button_7,
                R.id.button_8,
                R.id.button_9,
                R.id.button_0
        };
    }


    private void setView() {
        buttonNumClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button button = (Button) v;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);

//                calculator.onButtonNumPressed(v.getId());
//                textViewNotModify.setText(calculator.getText());
//                if (v.getId() == R.id.button_clean) {
//                    editTextModify.setText(calculator.getEquallyn());
//                    textViewNotModify.setText(calculator.getText());
//                }
            }
        };

        for (int i = 0; i < buttonNumIds.length; i++) {
            findViewById(buttonNumIds[i]).setOnClickListener(buttonNumClickListener);
        }


    }


}