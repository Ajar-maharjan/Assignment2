package com.fragment.assignment2.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fragment.assignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArmstrongFragment extends Fragment implements View.OnClickListener {

    private EditText etArmstrong;
    private TextView tvArmstrong;

    public ArmstrongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);
        Button btnArmstrong = view.findViewById(R.id.btnArmstrong);
        etArmstrong = view.findViewById(R.id.etArmstrong);
        tvArmstrong = view.findViewById(R.id.tvArmstrong);
        btnArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int number, temp, remainder, sum = 0;
        number = Integer.parseInt(etArmstrong.getText().toString());
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = sum + (remainder * remainder * remainder);
            number = number / 10;
        }
        if (temp == sum) {
            tvArmstrong.setText(temp + " is Armstrong number");
        } else {
            tvArmstrong.setText(temp + " is not Armstrong number");
        }
    }
}
