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
public class CircleAreaFragment extends Fragment implements View.OnClickListener {

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
        Button btnCalculateArea = view.findViewById(R.id.btnCalculateArea);
        etRadius = view.findViewById(R.id.etRadius);
        tvCircleArea = view.findViewById(R.id.tvCircleArea);
        btnCalculateArea.setOnClickListener(this);
        return view;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etRadius.getText())) {
            etRadius.setError("Enter the radius");
            return;
        }
        float area, radius;
        radius = Float.parseFloat(etRadius.getText().toString());
        area = (float) (3.14 * radius * radius);
        tvCircleArea.setText(area + "sq cm is the area of circle");
    }
}
