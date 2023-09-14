package com.pucmm.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.pucmm.myapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnSent.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
            String message = binding.editField.getText().toString();
            intent.putExtra("value", message);
            startActivity(intent);
        });

//        btnSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(MainActivity.this, "Soy un boton desde OnClickListener", Toast.LENGTH_LONG);
//                toast.show();
//            }
//        });

    }

//    @Override
//    public void onClick(View v) {
//
//        Toast toast = Toast.makeText(MainActivity.this, "Soy un boton desde OnClickListener", Toast.LENGTH_LONG);
//        toast.show();
//    }

//    public void sendMessage(View view) {
//        Toast toast = Toast.makeText(MainActivity.this, "Soy un boton", Toast.LENGTH_LONG);
//        toast.show();
//    }


}