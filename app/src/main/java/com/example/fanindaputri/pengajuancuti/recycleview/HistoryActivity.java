package com.example.fanindaputri.pengajuancuti.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


import com.example.fanindaputri.pengajuancuti.R;

public class HistoryActivity extends AppCompatActivity {

    private List<UserModel> mListUser = new ArrayList<>();
    private RecyclerView rvUser;
    private UserAdapter mUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUser = (RecyclerView) findViewById(R.id.recyclerview);

        mUserAdapter = new UserAdapter(mListUser);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvUser.setLayoutManager(mLayoutManager);
        rvUser.setItemAnimator(new DefaultItemAnimator());
        rvUser.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rvUser.setAdapter(mUserAdapter);

        prepareUserData();
    }

    private void prepareUserData() {
        UserModel userModel = new UserModel("Veni Fela Yanuarita", "Pengajuan Cuti Besar", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Eni Nofita Sari", "Pengajuan Cuti Hamil", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Reza Amalia", "Pengajuan Cuti Hamil", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Narto Hidayat", "Pengajuan Cuti Tahunan", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Renaldi Pramudia", "Pengajuan Cuti Besar", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Fani Enda", "Pengajuan Cuti Tahunan", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Nanang Hidayat", "Pengajuan Cuti Hamil", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Aldo Galih", "Pengajuan Cuti Tahunan", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Tias Karisma", "Pengajuan Cuti Hamil", "2018");
        mListUser.add(userModel);

        userModel = new UserModel("Alif fitrawan", "Pengajuan Cuti Besar", "2018");
        mListUser.add(userModel);

        mUserAdapter.notifyDataSetChanged();
    }
}