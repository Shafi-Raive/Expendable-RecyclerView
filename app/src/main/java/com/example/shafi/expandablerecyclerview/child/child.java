package com.example.shafi.expandablerecyclerview.child;

import android.os.Parcel;
import android.os.Parcelable;

public class child implements Parcelable {

    public final String name;

    public child(String name) {
        this.name = name;
    }

    protected child(Parcel in) {
        name = in.readString();
    }

    public static final Creator<child> CREATOR = new Creator<child>() {
        @Override
        public child createFromParcel(Parcel in) {
            return new child(in);
        }

        @Override
        public child[] newArray(int size) {
            return new child[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(name);

    }
}
