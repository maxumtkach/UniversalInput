package com.example.universalinput;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView messageText;
      private EditText nameEditText;
            private EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

        messageText = findViewById(R.id.text_message);
           nameEditText = findViewById(R.id.editText_name);
              emailEditText = findViewById(R.id.editText_email);

        Button clickOkButton = findViewById(R.id.button_ok);
                clickOkButton.setOnClickListener(clickOkListener);

        Button clickClearButton = findViewById(R.id.button_clear);
              clickClearButton.setOnClickListener(clickClearListener);

    }

    private final View.OnClickListener clickOkListener = new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {


            messageText.setText(getString(R.string.universal_input,nameEditText.getText().toString(),emailEditText.getText().toString()));
        }
    };

    private final View.OnClickListener clickClearListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {    //Удаляем все

            messageText.setText("");
                nameEditText.getText().clear();
                   emailEditText.getText().clear();
        }
    };
}
