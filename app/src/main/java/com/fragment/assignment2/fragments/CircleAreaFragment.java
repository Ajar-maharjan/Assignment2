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
public class CircleAreaFragment extends Fragment implements View.OnClickListener {

    private Button btnCalculateArea;
    private EditText etRadius;
    private TextView tvCircleArea;

    public CircleAreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circlearea, container, false);
        btnCalculateArea = view.findViewById(R.id.btnCalculateArea);
        etRadius = view.findViewById(R.id.etRadius);
        tvCircleArea = view.findViewById(R.id.tvCircleArea);
        btnCalculateArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float area, radius;
        radius = Float.parseFloat(etRadius.getText().toString());
        area = (float) (3.14 * radius * radius);
        tvCircleArea.setText(area + "");
    }
}
