package com.example.getripmenew.dto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nariman.getripmenew.R;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.CommentsViewHolder>{
    private Context mCtx;
    private List<Comment> commentsList;

    public CommentsAdapter(Context mCtx, List<Comment> commentsList) {
        this.mCtx = mCtx;
        this.commentsList = commentsList;
    }

    @NonNull
    @Override
    public CommentsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.recyclerview_comments,parent,false);
        return new CommentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsViewHolder holder, int i) {
        Comment comment = commentsList.get(i);
        holder.idView.setText(comment.getId());
        holder.user_idView.setText(comment.getUserId());
        holder.reply_toView.setText(comment.getReplyTo());
        holder.nameView.setText(comment.getName());
        holder.contentView.setText(comment.getContent());
    }

    @Override
    public int getItemCount() {
        return commentsList.size();
    }

    class CommentsViewHolder extends RecyclerView.ViewHolder{
        TextView idView,user_idView,reply_toView,nameView,contentView;
        public CommentsViewHolder(View view){
            super(view);
            idView = itemView.findViewById(R.id.idView);
            user_idView = itemView.findViewById(R.id.user_idView);
            reply_toView = itemView.findViewById(R.id.reply);
            nameView = itemView.findViewById(R.id.nameVIew);
            contentView = itemView.findViewById(R.id.contentVIew);

        }
    }
}
