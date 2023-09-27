package com.pucmm.icc451;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pucmm.icc451.adapters.WordListAdapter2;

public class RoomViewActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_view2);


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final WordListAdapter2 adapter = new WordListAdapter2(new WordListAdapter2.WordDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}