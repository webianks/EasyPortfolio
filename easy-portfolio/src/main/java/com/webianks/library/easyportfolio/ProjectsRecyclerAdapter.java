package com.webianks.library.easyportfolio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by R Ankit on 03-05-2017.
 */

public class ProjectsRecyclerAdapter extends RecyclerView.Adapter<ProjectsRecyclerAdapter.VH> {

    private Context context;
    private List<Project> projectsList;
    private ItemClickListener itemClickListener;

    ProjectsRecyclerAdapter(Context context, List<Project> projectsList) {
        this.context = context;
        this.projectsList = projectsList;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.single_project_view, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

        holder.title.setText(projectsList.get(position).getProjectName());
        holder.desc.setText(projectsList.get(position).getProjectDesc());
    }

    @Override
    public int getItemCount() {
        return (projectsList != null) ? projectsList.size() : 0;
    }


    public void setOnItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    class VH extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView desc;
        private FrameLayout mainContainer;

        VH(final View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.projectName);
            desc = (TextView) itemView.findViewById(R.id.projectDesc);
            mainContainer = (FrameLayout) itemView.findViewById(R.id.mainContainer);

            mainContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (itemClickListener != null)
                        itemClickListener.itemClicked("http://webianks.com");
                }
            });

        }
    }

    interface ItemClickListener {
        void itemClicked(String url);
    }
}
