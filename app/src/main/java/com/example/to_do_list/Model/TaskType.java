package com.example.to_do_list.Model;

public class TaskType {
    private String mName;
    private int mColor;

    public TaskType(String mName, int mColor) {
        this.mName = mName;
        this.mColor = mColor;
    }

    public TaskType() {
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }
}
