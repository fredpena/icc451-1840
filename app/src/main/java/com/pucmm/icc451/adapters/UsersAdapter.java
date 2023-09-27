package com.pucmm.icc451.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pucmm.icc451.R;
import com.pucmm.icc451.entities.User;

import java.util.List;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(@NonNull Context context, @NonNull List<User> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        User item = getItem(position);

        TextView name = convertView.findViewById(R.id.name);
        TextView homeTown = convertView.findViewById(R.id.userHomeTown);

        name.setText(item.getName());
        homeTown.setText(item.getHometown());

        return convertView;
    }
}
