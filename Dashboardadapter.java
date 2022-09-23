package com.example.survey;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.survey.R;
import com.example.survey.User;

import java.util.ArrayList;

public class Dashboardadapter extends RecyclerView.Adapter<Dashboardadapter.viewHolder> {

    ArrayList<User.Dashbordmodel> list;
    Context context;

    public Dashboardadapter(ArrayList<User.Dashbordmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.mainscreen_recycleview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        User.Dashbordmodel model = list.get(position);
        holder.userimage.setImageResource(model.getUserimage());
        holder.postimage.setImageResource(model.getPostimage());
        holder.username.setText(model.getUsername());
        holder.userabout.setText(model.getUserabout());
        holder.like.setText(model.getLike());
        holder.unlike.setText(model.getUnlike());
        holder.comment.setText(model.getComment());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView postimage,userimage;
        TextView username,userabout,like,comment,unlike;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            postimage = itemView.findViewById(R.id.postimage);
            userimage = itemView.findViewById(R.id.profile_image);
            username = itemView.findViewById(R.id.username);
            userabout = itemView.findViewById(R.id.userabout);
            like = itemView.findViewById(R.id.like);
            unlike = itemView.findViewById(R.id.unlike);
            comment = itemView.findViewById(R.id.comment);

        }
    }
}
