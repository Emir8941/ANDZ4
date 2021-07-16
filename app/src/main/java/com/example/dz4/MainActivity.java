package com.example.dz4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    Button btnOpenFragment;
    EditText etValue;
    FrameLayout containerFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenFragment = findViewById(R.id.btn_open_fragment);
        etValue = findViewById(R.id.et_value);
        containerFragment = findViewById(R.id.container_fragment);
        btnOpenFragment.setOnClickListener(new View.OnClickListener() {
            boolean isCLick = false;

            @Override
            public void onClick(View v) {
                String text = etValue.getText().toString();

                if ( isCLick == false ) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.container_fragment, FirstFragment.newInstance(text,"TEXT2"));
                    transaction.addToBackStack("FirstFragment");
                    transaction.commit();
                    isCLick = true;


                } else if (isCLick == true) {

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.container_fragment, SecondFragment.newInstance(text));
                    transaction.addToBackStack("SecondFragment");
                    transaction.commit();
                    isCLick = false;


                }
            }
        });

    }
}