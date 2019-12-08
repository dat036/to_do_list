package com.example.to_do_list.Model;

public class Task {
    private String mTitle;
    private int mColor;
    private String mDescription;
    private int mTimeStart;
    private int mTimeEnd;

    public Task(String mTitle, int mColor, String mDescription, int mTimeStart, int mTimeEnd) {
        this.mTitle = mTitle;
        this.mColor = mColor;
        this.mDescription = mDescription;
        this.mTimeStart = mTimeStart;
        this.mTimeEnd = mTimeEnd;
    }

    public Task() {
    }

    public Task(String mTitle, int mColor, String mDescription) {
        this.mTitle = mTitle;
        this.mColor = mColor;
        this.mDescription = mDescription;
    }

    public Task(String mTitle, int mColor, String mDescription, int time) {
        this.mTitle = mTitle;
        this.mColor = mColor;
        this.mDescription = mDescription;
        this.mTimeStart = time;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmTimeStart() {
        return mTimeStart;
    }

    public void setmTimeStart(int mTimeStart) {
        this.mTimeStart = mTimeStart;
    }

    public int getmTimeEnd() {
        return mTimeEnd;
    }

    public void setmTimeEnd(int mTimeEnd) {
        this.mTimeEnd = mTimeEnd;
    }

}
