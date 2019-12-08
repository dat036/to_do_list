package com.example.to_do_list.Adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.to_do_list.R;
import com.example.to_do_list.Model.Task;

import java.util.ArrayList;
import java.util.List;

public class EditAdapter  extends RecyclerView.Adapter<EditAdapter.ViewHolder> {
    private List<Task> mTask = new ArrayList<>();

    public EditAdapter(List<Task> mTask) {
        this.mTask = mTask;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater =LayoutInflater.from(context);
        View contracView = layoutInflater.inflate(R.layout.item_task_list,parent,false);
        return new ViewHolder(contracView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Task task = mTask.get(position);
        holder.txtitle.setText(task.getmTitle());
        holder.txdetail.setText(task.getmDescription());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.txcolor.setBackgroundTintList(ColorStateList.valueOf(task.getmColor()));
        }
    }

    @Override
    public int getItemCount() {
        return mTask.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtitle;
        public TextView txdetail;
        public TextView txcolor;
        public RelativeLayout viewBackground, viewForeground;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtitle = itemView.findViewById(R.id.tv_tast_title);
            txdetail = itemView.findViewById(R.id.tv_tast_detail);
            txcolor = itemView.findViewById(R.id.tv_work_color);
            viewForeground = (RelativeLayout) itemView.findViewById(R.id.view_foreground);
            viewBackground = (RelativeLayout) itemView.findViewById(R.id.view_background);
        }
    }
    public void removeItem(int position){
        mTask.remove(position);
        notifyItemRemoved(position);
    }
}
