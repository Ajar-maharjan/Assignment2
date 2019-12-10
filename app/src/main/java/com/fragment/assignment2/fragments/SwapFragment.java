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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwapFragment extends Fragment implements View.OnClickListener {

    private EditText etNumber1, etNumber2;
    private TextView tvSwap;

    public SwapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap, container, false);
        etNumber1 = view.findViewById(R.id.etNumber1);
        etNumber2 = view.findViewById(R.id.etNumber2);
        tvSwap = view.findViewById(R.id.tvSwap);
        Button btnSwap = view.findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(this);
        return view;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNumber1.getText())) {
            etNumber2.setError("Enter first number");
            return;
        }
        if (TextUtils.isEmpty(etNumber2.getText())) {
            etNumber2.setError("Enter second number");
            return;
        }
        String[] Numbers = {etNumber1.getText().toString(), etNumber2.getText().toString()};
        List<String> tempNumbers = Arrays.asList(Numbers);
        Collections.reverse(tempNumbers);
        String[] reversed = tempNumbers.toArray(Numbers);
        tvSwap.setText("Swapped result is: " + Arrays.toString(reversed));
    }
}
