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
public class AutomorphicFragment extends Fragment implements View.OnClickListener {

    private EditText etAutomorphic;
    private TextView tvAutomorphic;

    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        Button btnAutomorphic = view.findViewById(R.id.btnAutomorphic);
        etAutomorphic = view.findViewById(R.id.etAutomorphic);
        tvAutomorphic = view.findViewById(R.id.tvAutomorphic);
        btnAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etAutomorphic.getText().toString());

        int i, digit = 1;

        for (i = num; i > 0; i = i / 10) {
            digit = digit * 10;
        }
        if ((num * num) % digit == num) {
            tvAutomorphic.setText(num + "Number is automorphic");
        } else {
            tvAutomorphic.setText(num + "Number is not automorphic");
        }
    }
}
