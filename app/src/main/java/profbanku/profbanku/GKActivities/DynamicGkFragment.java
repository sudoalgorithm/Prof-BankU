package profbanku.profbanku.GKActivities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import profbanku.profbanku.R;

public class DynamicGkFragment extends android.support.v4.app.Fragment {

    public DynamicGkFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_dynamic_gk_fragment, container, false);
    }
}
