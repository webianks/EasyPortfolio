package com.webianks.library.easyportfolio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by R Ankit on 03-05-2017.
 */

public class ProjectsRecyclerAdapter extends RecyclerView.Adapter<ProjectsRecyclerAdapter.VH> {

    private Context context;
    private List<Projects> projectsList;

    public ProjectsRecyclerAdapter(Context context,List<Projects> projectsList) {
        this.context = context;
        this.projectsList = projectsList;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.single_project_view,parent,false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

        holder.title.setText(projectsList.get(position).getProjectName());
        holder.desc.setText(projectsList.get(position).getProjectDesc());
    }

    @Override
    public int getItemCount() {
        return (projectsList != null)? projectsList.size() : 0;
    }

    class VH extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView desc;

        VH(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.projectName);
            desc = (TextView) itemView.findViewById(R.id.projectDesc);

        }
    }
}
