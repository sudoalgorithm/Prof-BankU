package profbanku.profbanku.QuantitativeAptitudeActivities.Average;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import profbanku.profbanku.R;

public class VideosAverageActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_videos_average,container,false);
        String[] indexavg = new String[2];
        for (int i = 0; i < indexavg.length; i++){
            indexavg[i] = "Video "+ (i+1);
        }
        ListView listView = (ListView) view.findViewById(R.id.list_view_average);
        listView.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.list_item_row, R.id.tv_list_item_row, indexavg));
        return view;
    }
}
