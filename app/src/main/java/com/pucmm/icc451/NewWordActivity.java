package com.pucmm.icc451;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.pucmm.icc451.databinding.ActivityNewWordBinding;
import com.pucmm.icc451.databinding.ActivityRoomViewBinding;

public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "wordlistsql.REPLY";

    private ActivityNewWordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNewWordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final Button button = binding.buttonSave;
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(binding.editWord.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String word = binding.editWord.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY, word);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }
}