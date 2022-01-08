package com.geektech.unituitests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geektech.unituitests.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        math = new Math();
        setUpListeners();
    }

    private void setUpListeners() {
        binding.btnAdd.setOnClickListener(v -> {
            binding.tvResult.setVisibility(View.VISIBLE);
            String num1 = binding.firstNumEdt.getText().toString();
            String num2 = binding.secondNumEdt.getText().toString();
            binding.tvResult.setText(math.add(num1, num2));
        });
        binding.btnMinus.setOnClickListener(v->{
            binding.tvResult.setVisibility(View.VISIBLE);
            String num1 = binding.firstNumEdt.getText().toString();
            String num2 = binding.secondNumEdt.getText().toString();
            binding.tvResult.setText(math.sub(num1, num2));
        });
        binding.btnDiv.setOnClickListener(v->{
            binding.tvResult.setVisibility(View.VISIBLE);
            String num1 = binding.firstNumEdt.getText().toString();
            String num2 = binding.secondNumEdt.getText().toString();
            binding.tvResult.setText(math.div(num1, num2));
        });
        binding.btnMult.setOnClickListener(v->{
            binding.tvResult.setVisibility(View.VISIBLE);
            String num1 = binding.firstNumEdt.getText().toString();
            String num2 = binding.secondNumEdt.getText().toString();
            binding.tvResult.setText(math.multiply(num1, num2));
        });
    }
}