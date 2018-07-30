package com.example.fanindaputri.pengajuancuti.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fanindaputri.pengajuancuti.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {


    private List<UserModel> mlListUser;



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView user, cuti, year;

        public ViewHolder(View view) {
            super(view);
            user = (TextView) view.findViewById(R.id.user);
            cuti = (TextView) view.findViewById(R.id.cuti);
            year = (TextView) view.findViewById(R.id.year);
        }
    }

    public UserAdapter(List<UserModel> mlListUser) {
        this.mlListUser = mlListUser;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_user_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        UserModel userModel = mlListUser.get(position);
        holder.user.setText(userModel.getName());
        holder.cuti.setText(userModel.getCuti());
        holder.year.setText(userModel.getYear());
    }

    @Override
    public int getItemCount() {
        return mlListUser.size();
    }
}