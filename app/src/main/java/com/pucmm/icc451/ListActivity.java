package com.pucmm.icc451;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.pucmm.icc451.adapters.UsersAdapter;
import com.pucmm.icc451.databinding.ActivityListBinding;
import com.pucmm.icc451.entities.User;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    ActivityListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        // Construct the data source
        List<User> arrayOfUsers = User.getUsers();
//
        binding.lvUsers.setAdapter(new UsersAdapter(this, arrayOfUsers));

       // binding.request.setOnClickListener(view -> requestPermissions(perms, requestCode));
    }
}