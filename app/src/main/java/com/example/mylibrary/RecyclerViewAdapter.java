package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {

    private Context mContext;
    private List<Book> mlist;

    public RecyclerViewAdapter(Context mContext, List<Book> mlist) {
        this.mContext = mContext;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater=LayoutInflater.from(mContext);
        view=inflater.inflate(R.layout.cardview_item_book,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {
        holder.tvTitle.setText(mlist.get(position).getTitle());
        holder.ivImage.setImageResource(mlist.get(position).getBookImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,Book_Activity.class);

                //passing data to the book activity
                intent.putExtra("Title",mlist.get(position).getTitle());
                intent.putExtra("Description",mlist.get(position).getDescription());
                intent.putExtra("Category",mlist.get(position).getCategory());
                intent.putExtra("Book Image",mlist.get(position).getBookImage());
                //start activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvTitle;
        ImageView ivImage;
        CardView cardView;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle=(TextView) itemView.findViewById(R.id.tvTitle);
            ivImage=(ImageView) itemView.findViewById(R.id.ivImage);
            cardView=(CardView) itemView.findViewById(R.id.cardview_id);

        }


    }


}
