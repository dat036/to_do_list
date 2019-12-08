package com.example.to_do_list.Helper;

import androidx.recyclerview.widget.RecyclerView;

public interface RecyclerItemTouchHelperListener {
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position);
}
