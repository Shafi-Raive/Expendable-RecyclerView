package com.example.shafi.expandablerecyclerview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shafi.expandablerecyclerview.GroupViewHoldername;
import com.example.shafi.expandablerecyclerview.R;
import com.example.shafi.expandablerecyclerview.child.child;
import com.example.shafi.expandablerecyclerview.child.childViewHoldername;
import com.example.shafi.expandablerecyclerview.expendView;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ChildAdapter extends ExpandableRecyclerViewAdapter<GroupViewHoldername, childViewHoldername> {


    public ChildAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public GroupViewHoldername onCreateGroupViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expendable_view, parent,false);
        return new GroupViewHoldername(view);
    }

    @Override
    public childViewHoldername onCreateChildViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expendable_child_view, parent,false);
        return new childViewHoldername(view);
    }

    @Override
    public void onBindChildViewHolder(childViewHoldername holder, int flatPosition, ExpandableGroup group, int childIndex) {

        final child child = (child) group.getItems().get(childIndex);
        holder.bind(child);

    }

    @Override
    public void onBindGroupViewHolder(GroupViewHoldername holder, int flatPosition, ExpandableGroup group) {

        final expendView  expendView = (expendView) group;
        holder.bind(expendView);



    }
}
