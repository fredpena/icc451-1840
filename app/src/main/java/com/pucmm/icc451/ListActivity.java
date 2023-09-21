package com.pucmm.icc451;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.pucmm.icc451.databinding.ActivityListBinding;

import java.util.ArrayList;
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
        binding.lvUsers.setAdapter(new UsersAdapter2(this, arrayOfUsers));

       // binding.request.setOnClickListener(view -> requestPermissions(perms, requestCode));
    }
}