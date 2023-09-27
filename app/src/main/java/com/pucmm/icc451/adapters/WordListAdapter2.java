package com.pucmm.icc451.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.pucmm.icc451.R;
import com.pucmm.icc451.entities.Word;
import org.jetbrains.annotations.NotNull;

public class WordListAdapter2 extends ListAdapter<Word, WordListAdapter2.WordViewHolder> {


    public WordListAdapter2(@NonNull @NotNull DiffUtil.ItemCallback<Word> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @NotNull
    @Override
    public WordListAdapter2.WordViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return WordListAdapter2.WordViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WordListAdapter2.WordViewHolder holder, int position) {
        Word current = getItem(position);
        holder.bind(current.getWord());
    }


    public static class WordDiff extends DiffUtil.ItemCallback<Word> {

        @Override
        public boolean areItemsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
            return oldItem.getWord().equals(newItem.getWord());
        }
    }

    static class WordViewHolder extends RecyclerView.ViewHolder {
        private final TextView wordItemView;

        private WordViewHolder(View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.textView);
        }

        public void bind(String text) {
            wordItemView.setText(text);
        }

        static WordViewHolder create(ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recyclerview_item, parent, false);
            return new WordViewHolder(view);
        }
    }
}
