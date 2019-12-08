package com.example.to_do_list.Activity;

import android.content.ClipData;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.to_do_list.Adapter.EditAdapter;
import com.example.to_do_list.Helper.RecyclerItemTouchHelper;
import com.example.to_do_list.Helper.RecyclerItemTouchHelperListener;
import com.example.to_do_list.Model.Task;
import com.example.to_do_list.R;

import java.util.ArrayList;

public class EditActivity extends AppCompatActivity implements RecyclerItemTouchHelperListener {

    private RecyclerView rc_listTask;
    private EditAdapter mAdapterEdit;
    private ArrayList<Task> mTaskList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        rc_listTask = findViewById(R.id.rc_list_task);
        initData();
        mAdapterEdit = new EditAdapter(mTaskList);
        rc_listTask.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rc_listTask.setItemAnimator(new DefaultItemAnimator());
        rc_listTask.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        rc_listTask.setLayoutManager(new LinearLayoutManager(this));
        rc_listTask.setAdapter(mAdapterEdit);

        ItemTouchHelper.SimpleCallback itemTouchHelperCallBack
                = new RecyclerItemTouchHelper(0,ItemTouchHelper.LEFT,this);
        new ItemTouchHelper(itemTouchHelperCallBack).attachToRecyclerView(rc_listTask);

    }

    private void initData() {
        mTaskList.add(new Task("Do Yoga", getResources().getColor(R.color.color_black),"15 Minutes"));
        mTaskList.add(new Task("Go Shopping", getResources().getColor(R.color.color_blue),"Buy bread"));
        mTaskList.add(new Task("Go Shopping", getResources().getColor(R.color.color_pink),"Bananas"));
        mTaskList.add(new Task("Meeting", getResources().getColor(R.color.color_green),"Skype Meeting"));
        mTaskList.add(new Task("Running", getResources().getColor(R.color.color_yellow),"Go Running"));
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {
        if(viewHolder instanceof EditAdapter.ViewHolder)
        {
            String name = mTaskList.get(viewHolder.getAdapterPosition()).getmTitle();
//            ClipData.Item deleteItem = mTaskList.get(viewHolder.getAdapterPosition());
//            int
        }
    }
}
