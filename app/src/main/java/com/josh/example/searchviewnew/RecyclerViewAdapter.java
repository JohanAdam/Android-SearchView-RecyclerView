package com.josh.example.searchviewnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josh on 1/31/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private final LayoutInflater mInflater;
    private List<Data>mItemList;

    public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView name;
        TextView subText;
        TextView memberPhoto;

        public RecyclerViewViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.person_name);
            subText = (TextView)itemView.findViewById(R.id.person_subtext);
            memberPhoto = (TextView)itemView.findViewById(R.id.Salery);
        }

        public void bind(Data data){
            name.setText(data.getTitle());
            subText.setText(data.getLocation());
            memberPhoto.setText(data.getJobType());
        }
    }

    public RecyclerViewAdapter(Context context, List<Data> itemList) {
        mInflater = LayoutInflater.from(context);
        mItemList = new ArrayList<>(itemList);

    }

    @Override
    public RecyclerViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = mInflater.inflate(R.layout.cardview_detail, parent, false);
        return new RecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewViewHolder holder, final int position) {
        final Data data = mItemList.get(position);
        holder.bind(data);

//        holder.name.setText(mItemList.get(position).name);
//        holder.subText.setText(mItemList.get(position).subText);
//        holder.memberPhoto.setImageResource(mItemList.get(position).photoId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("DATA", mItemList.get(position));
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.mItemList.size();

    }

    public void setItems(List<Data> datas){
        mItemList = new ArrayList<>(datas);
    }


}
