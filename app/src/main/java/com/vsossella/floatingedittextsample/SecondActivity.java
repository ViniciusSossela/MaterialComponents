package com.vsossella.floatingedittextsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.vsossella.materialcomponents.FloatingEditText;
import com.vsossella.materialcomponents.ObservableFloating;

/**
 * Created by vsossella on 28/12/17.
 */

public class SecondActivity extends AppCompatActivity {

    ObservableFloating renda;
    FloatingEditText floatingEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingEditText = ((FloatingEditText) findViewById(R.id.floating));

        renda = new ObservableFloating(floatingEditText);

        ((FloatingEditText) findViewById(R.id.floating)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        final Button button = (Button) findViewById(R.id.button_test);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, renda.get(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
