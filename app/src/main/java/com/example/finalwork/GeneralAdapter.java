package com.example.finalwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class GeneralAdapter extends RecyclerView.Adapter<GeneralAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Entity> entities;

    public GeneralAdapter(Context context, List<Entity> entities) {
        this.inflater = LayoutInflater.from(context);
        this.entities = entities;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Entity entity = entities.get(position);
        holder.resourceView.setImageResource(entity.getResource());
        holder.descriptionView.setText(entity.getDescription());
        holder.nameView.setText(entity.getName());
    }

    @Override
    public int getItemCount() {
        return entities.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля
        final ImageView resourceView;
        final TextView nameView, descriptionView;


        public ViewHolder(View itemView) {
            super(itemView);
            resourceView = itemView.findViewById(R.id.resource);
            nameView = itemView.findViewById(R.id.name);
            descriptionView = itemView.findViewById(R.id.description);
        }
    }
}
