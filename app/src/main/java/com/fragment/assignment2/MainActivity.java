package com.fragment.assignment2;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.fragment.assignment2.fragments.ArmstrongFragment;
import com.fragment.assignment2.fragments.AutomorphicFragment;
import com.fragment.assignment2.fragments.CircleAreaFragment;
import com.fragment.assignment2.fragments.PalindromeFragment;
import com.fragment.assignment2.fragments.SimpleInterestFragment;
import com.fragment.assignment2.fragments.SwapFragment;

public class MainActivity extends AppCompatActivity {

    Button btnCircleArea, btnPalindrome, btnSimpleInterest,
            btnArmstrong, btnAutomorphic, btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCircleArea = findViewById(R.id.btnCircleArea);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnSwap = findViewById(R.id.btnSwap);
        btnCircleArea.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                CircleAreaFragment circleAreaFragment = new CircleAreaFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, circleAreaFragment);
                fragmentTransaction.commit();
            }
        });
        btnPalindrome.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, palindromeFragment);
                fragmentTransaction.commit();
            }
        });
        btnSimpleInterest.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SimpleInterestFragment simpleInterestFragment = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, simpleInterestFragment);
                fragmentTransaction.commit();
            }
        });

        btnArmstrong.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ArmstrongFragment armstrongFragment = new ArmstrongFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, armstrongFragment);
                fragmentTransaction.commit();
            }
        });
        btnAutomorphic.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphicFragment);
                fragmentTransaction.commit();
            }
        });
        btnSwap.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SwapFragment swapFragment = new SwapFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, swapFragment);
                fragmentTransaction.commit();
            }
        });


    }
}
