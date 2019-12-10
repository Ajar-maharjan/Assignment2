package com.fragment.assignment2.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.fragment.assignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {

    private EditText etPrincipal, etTime, etRate;
    private TextView tvSimpleInterest;

    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simpleinterest, container, false);
        etPrincipal = view.findViewById(R.id.etPrincipal);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);
        tvSimpleInterest = view.findViewById(R.id.tvSimpleInterest);
        Button btnCalculateSI = view.findViewById(R.id.btnCalculateSI);
        btnCalculateSI.setOnClickListener(this);
        return view;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etPrincipal.getText())) {
            etPrincipal.setError("Enter the principal");
            return;
        }
        if (TextUtils.isEmpty(etTime.getText())) {
            etTime.setError("Enter the time");
            return;
        }
        if (TextUtils.isEmpty(etRate.getText())) {
            etRate.setError("Enter the rate");
            return;
        }
        float principal, time, rate, interest;
        principal = Float.parseFloat(etPrincipal.getText().toString());
        time = Float.parseFloat(etTime.getText().toString());
        rate = Float.parseFloat(etRate.getText().toString());
        interest = (principal * time * rate) / 100;
        tvSimpleInterest.setText("Simple interest is: Rs. " + interest);
    }
}

