package profbanku.profbanku.GKActivities;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import profbanku.profbanku.R;

/**
 * Created by kunalmalhotra on 30/08/17.
 */

public class GKViewHolder extends RecyclerView.ViewHolder{
    ImageView mImageView;
    public GKViewHolder(View itemView) {
        super(itemView);
        mImageView = (ImageView) itemView.findViewById(R.id.image_view_rv_gk);
    }
}
