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
public class PalindromeFragment extends Fragment implements View.OnClickListener {

    private Button btnPalindrome;
    private EditText etPalindrome;
    private TextView tvPalindrome;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        btnPalindrome = view.findViewById(R.id.btnPalindrome);
        etPalindrome = view.findViewById(R.id.etPalindrome);
        tvPalindrome = view.findViewById(R.id.tvPalindrome);
        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int temp, remainder, reverse = 0;
        int num = Integer.parseInt(etPalindrome.getText().toString());
        temp = num;

        while (num != 0) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }

        if (temp == reverse) {
            tvPalindrome.setText("The number is Palindrome!");
        } else {
            tvPalindrome.setText("The number is not Palindrome!");
        }
    }

}
