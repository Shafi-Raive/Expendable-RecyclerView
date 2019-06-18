package com.example.shafi.expandablerecyclerview;

import com.example.shafi.expandablerecyclerview.child.child;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class expendView extends ExpandableGroup<child> {
    public expendView(String title, List<child> items) {
        super(title, items);
    }
}
