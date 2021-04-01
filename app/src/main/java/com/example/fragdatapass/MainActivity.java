package com.example.fragdatapass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btn2Send;
    FragmentManager manager;
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        manager = getSupportFragmentManager();
    }

    private void init() {
    num1 = findViewById(R.id.num1);
    num2 = findViewById(R.id.num2);
    btn2Send = findViewById(R.id.btn2Send);
    }

    public void send2Frag(View view) {
        NewFragment newFragment = new NewFragment();

        Bundle bundle = new Bundle();
        int number1= Integer.parseInt(num1.getText().toString());
        int number2= Integer.valueOf(num2.getText().toString());
        bundle.putInt("first", number1);
        bundle.putInt("second", number2);

        newFragment.setArguments(bundle);
        transaction = manager.beginTransaction();
        transaction.add(R.id.container, newFragment, "newFrag");
        transaction.commit();
    }
}