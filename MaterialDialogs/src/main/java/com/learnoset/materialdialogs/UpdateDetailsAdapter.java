package com.learnoset.materialdialogs;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UpdateDetailsAdapter extends RecyclerView.Adapter<UpdateDetailsAdapter.MyViewHolder> {

    private List<String> updateDetailsList;
    private int textColor;

    public UpdateDetailsAdapter(List<String> updateDetailsList) {
        this.updateDetailsList = updateDetailsList;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.update_details_adapter_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.updateDetailsTxt.setText((position + 1)+". "+updateDetailsList.get(position));
        holder.updateDetailsTxt.setTextColor(textColor);
    }

    @Override
    public int getItemCount() {
        return updateDetailsList.size();
    }

    public void reloadRecyclerView(int textColor, List<String> updateDetailsList){
        this.textColor = textColor;
        this.updateDetailsList = updateDetailsList;
        notifyDataSetChanged();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView updateDetailsTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            updateDetailsTxt = itemView.findViewById(R.id.updateDetailsTxt);
        }
    }
}
