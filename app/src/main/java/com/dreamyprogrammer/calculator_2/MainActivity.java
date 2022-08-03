package com.dreamyprogrammer.calculator_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {
    int[] buttonNumIds;
    int[] buttonOperationIds;
    View.OnClickListener buttonNumClickListener;
    View.OnClickListener buttonOperationClickListener;
    MaterialTextView textViewFull;
    MaterialButton buttonPercent;
    MaterialButton buttonParenthesisStart;
    MaterialButton buttonParenthesisEnd;
    MaterialButton buttonPoint;
    MaterialButton buttonEqually;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setView();
    }

    private void findView() {
        textViewFull = findViewById(R.id.text_view_full);
        buttonPercent = findViewById(R.id.button_percent);
        buttonParenthesisStart = findViewById(R.id.button_parenthesis_start);
        buttonParenthesisEnd = findViewById(R.id.button_parenthesis_end);
        buttonPoint = findViewById(R.id.button_point);
        buttonEqually = findViewById(R.id.button_equally);
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
        buttonOperationIds = new int[]{
                R.id.button_division,
                R.id.button_minus,
                R.id.button_multiplication,
                R.id.button_plus,
        };
    }


    private void setView() {
        buttonNumClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);
                //TODO Написать обработку цыфр
            }
        };
        buttonOperationClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);
                //TODO Написать обработку операций
            }
        };

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);
                //TODO Написать обработку процента
            }
        });
        buttonParenthesisStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);
                //TODO Написать обработку процента
            }
        });
        buttonParenthesisEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);
                //TODO Написать обработку процента
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);
                //TODO Написать обработку процента
            }
        });
        buttonEqually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();
                textViewFull.setText(textViewFull.getText() + buttonText);
                //TODO Написать обработку процента
            }
        });

        for (int i = 0; i < buttonNumIds.length; i++) {
            findViewById(buttonNumIds[i]).setOnClickListener(buttonNumClickListener);
        }
        for (int i = 0; i < buttonOperationIds.length; i++) {
            findViewById(buttonOperationIds[i]).setOnClickListener(buttonOperationClickListener);
        }


    }


}