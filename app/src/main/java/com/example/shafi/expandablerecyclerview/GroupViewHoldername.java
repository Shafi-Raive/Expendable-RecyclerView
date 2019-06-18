package com.example.shafi.expandablerecyclerview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class GroupViewHoldername extends GroupViewHolder {

    private TextView mtv;

    public GroupViewHoldername(View itemView) {
        super(itemView);

        mtv = itemView.findViewById(R.id.textView);
    }

    public void bind(expendView expendView){
        mtv.setText(expendView.getTitle());
    }
}
