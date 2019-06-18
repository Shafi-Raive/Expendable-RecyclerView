package com.example.shafi.expandablerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shafi.expandablerecyclerview.Adapter.ChildAdapter;
import com.example.shafi.expandablerecyclerview.child.child;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onStart() {
        super.onStart();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<expendView> expendViews = new ArrayList<>();

        ArrayList<child> child = new ArrayList<>();
        child.add(new child("CSE"));
        child.add(new child("EEE"));
        child.add(new child("English"));
        child.add(new child("BBA"));

        expendView group = new expendView("versity", child);
        expendViews.add(group);

        ArrayList<child> addChild = new ArrayList<>();
        addChild.add(new child("window"));
        addChild.add(new child("sky"));
        addChild.add(new child("driver"));

        expendView micro = new expendView("department", addChild);
        expendViews.add(micro);

        ChildAdapter adapter = new ChildAdapter(expendViews);
        recyclerView.setAdapter(adapter);

    }
}
