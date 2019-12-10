package com.fragment.assignment2.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragment.assignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwapFragment extends Fragment implements View.OnClickListener {


    public SwapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap, container, false);
        btnArmstrong = view.findViewById(R.id.btnArmstrong);
        etArmstrong = view.findViewById(R.id.etArmstrong);
        tvArmstrong = view.findViewById(R.id.tvArmstrong);
        btnArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
