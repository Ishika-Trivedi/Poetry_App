package com.example.poetry_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.poetry_app.Adapter.PoetryAdapter;
import com.example.poetry_app.Models.PoetryModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PoetryAdapter poetryAdapter;
    List<PoetryModel> poetryModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poetryModelList.add(new PoetryModel(1,"ishika trivedi u need to work hard","ishika", "10-10-2010"));

        initialization();
        setadapter(poetryModelList);
    }

    private void initialization() {
        recyclerView = findViewById(R.id.poetry_recyclerView);
    }

    private void setadapter(List<PoetryModel> poetryModels) {
        poetryAdapter = new PoetryAdapter(this,poetryModels);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(poetryAdapter);

    }
}