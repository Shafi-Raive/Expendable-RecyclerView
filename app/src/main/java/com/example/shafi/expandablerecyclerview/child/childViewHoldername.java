package com.example.shafi.expandablerecyclerview.child;

import android.view.View;
import android.widget.TextView;

import com.example.shafi.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;


public class childViewHoldername extends ChildViewHolder {
    private TextView mtv;

    public childViewHoldername(View itemView) {
        super(itemView);

        mtv = itemView.findViewById(R.id.textView);

    }

    public void bind(child child){
        mtv.setText(child.name);
    }
}
