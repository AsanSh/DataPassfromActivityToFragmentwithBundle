package com.example.fragdatapass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewFragment extends Fragment {

    Button btn2Calc;
    TextView tvResult;
    int number1 = 0, number2 = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_frag, container, false);
/*      Bundle bundle = getArguments();
        int number1 = bundle.getInt("first", 0);
        int number2 = bundle.getInt("second",0);
*/
        btn2Calc = view.findViewById(R.id.btn2Calc);
        tvResult = view.findViewById(R.id.tvResult);

        btn2Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = number1 + number2;
                tvResult.setText("Результат " + result);
            }
        });

        return view;
    }

    public void sendData(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;


    }
}
