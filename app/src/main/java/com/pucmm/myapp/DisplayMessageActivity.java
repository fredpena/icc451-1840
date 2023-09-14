package com.pucmm.myapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.pucmm.myapp.databinding.ActivityDisplayMessageBinding;

public class DisplayMessageActivity extends AppCompatActivity {

    ActivityDisplayMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDisplayMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String message = intent.getStringExtra("value");

        binding.showMessage.setText(message);
    }
}