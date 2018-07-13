package com.example.hoang.recycelerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecceView;
    private recycelerviewAdapter mRecycelerviewAdapter;
    private List<Integer> mData = new ArrayList<>();
    private List<Integer> mData2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecceView = findViewById(R.id.recycelerview);
        mData.add(R.string.name_one);
        mData.add(R.string.name_two);
        mData.add(R.string.name_three);


        mData2.add(R.drawable.anh1);
        mData2.add(R.drawable.anh2);
        mData2.add(R.drawable.anh3);
        mRecycelerviewAdapter = new recycelerviewAdapter(mData, mData2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecceView.setLayoutManager(layoutManager);
        mRecceView.setAdapter(mRecycelerviewAdapter);
    }
}

