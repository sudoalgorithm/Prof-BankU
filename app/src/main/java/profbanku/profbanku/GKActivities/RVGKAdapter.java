package profbanku.profbanku.GKActivities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import profbanku.profbanku.R;

/**
 * Created by kunalmalhotra on 30/08/17.
 */

public class RVGKAdapter extends RecyclerView.Adapter<GKViewHolder> {

    List<GkRowModel> datalist = Collections.emptyList();
    private Context context;

    public RVGKAdapter(List<GkRowModel> datalist, Context context) {
        this.datalist = datalist;
        this.context = context;
    }

    @Override
    public GKViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_gk_layout, parent, false);
        GKViewHolder viewHolder = new GKViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GKViewHolder holder, int position) {
        holder.mImageView.setImageResource(datalist.get(position).getImages());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
}
