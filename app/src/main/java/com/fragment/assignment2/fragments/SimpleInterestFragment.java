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
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {

    private EditText etPrinciple, etTime, etRate;
    private TextView tvSimpleInterest;

    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simpleinterest, container, false);
        etPrinciple = view.findViewById(R.id.etPrinciple);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);
        Button btnCalculateSI = view.findViewById(R.id.btnCalculateSI);
        tvSimpleInterest = view.findViewById(R.id.tvSimpleInterest);
        btnCalculateSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principle, time, rate, interest;
        principle = Float.parseFloat(etPrinciple.getText().toString());
        time = Float.parseFloat(etTime.getText().toString());
        rate = Float.parseFloat(etRate.getText().toString());

        interest = (principle * time * rate) / 100;

        tvSimpleInterest.setText(String.format("%s is the simple interest", interest));

    }
}
}
