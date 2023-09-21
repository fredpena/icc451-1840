package com.pucmm.icc451;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudenViewHolder> {

    private List<Student> list;
    public StudentAdapter(List<Student> list) {
        this.list = list;
    }

    @NonNull
    @NotNull
    @Override
    public StudentAdapter.StudenViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student , parent , false);

        return new StudenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StudentAdapter.StudenViewHolder holder, int position) {
        Student student = list.get(position);

        holder.name.setText(student.getName());
        holder.lastName.setText(student.getLastName());
        holder.id.setText(student.getId());

        holder.sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Hola: " + student.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class StudenViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView lastName;
        TextView id;
        Button sent;

        public StudenViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            lastName = itemView.findViewById(R.id.lastName);
            id = itemView.findViewById(R.id.id);
            sent = itemView.findViewById(R.id.sent);

        }
    }
}
