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
public class PalindromeFragment extends Fragment implements View.OnClickListener {

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
        Button btnPalindrome = view.findViewById(R.id.btnPalindrome);
        etPalindrome = view.findViewById(R.id.etPalindrome);
        tvPalindrome = view.findViewById(R.id.tvPalindrome);
        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etPalindrome.getText())) {
            etPalindrome.setError("Enter the number");
            return;
        }
        int temp, remainder, reverse = 0;
        int num = Integer.parseInt(etPalindrome.getText().toString());
        temp = num;

        while (num != 0) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }

        if (temp == reverse) {
            tvPalindrome.setText(temp + " is Palindrome number");
        } else {
            tvPalindrome.setText(temp + " is not Palindrome number");
        }
    }

}

