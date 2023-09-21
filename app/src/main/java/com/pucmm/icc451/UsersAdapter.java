package com.pucmm.icc451;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UsersAdapter extends ArrayAdapter<User> {


    public UsersAdapter(@NonNull Context context, @NonNull List<User> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        // Get the data item for this position
        User user = getItem(position);

        // Lookup view for data population
        TextView tvName = convertView.findViewById(R.id.name);
//        TextView tvHome =  convertView.findViewById(R.id.town);
        // Populate the data into the template view using the data object
        tvName.setText(user.getName());
//        tvHome.setText(user.getHometown());
        // Return the completed view to render on screen
        return convertView;
    }
}
