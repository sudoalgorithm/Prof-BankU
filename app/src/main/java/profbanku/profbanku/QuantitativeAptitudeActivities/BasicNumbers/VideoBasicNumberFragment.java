package profbanku.profbanku.QuantitativeAptitudeActivities.BasicNumbers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import profbanku.profbanku.R;

public class VideoBasicNumberFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_video_basic_number_fragment,container,false);
        String[] index = new String[1];
        for (int i = 0; i < index.length; i++){
            index[i] = "Video "+ (i+1);
        }
        ListView listView = (ListView) view.findViewById(R.id.list_view_basic_number);
        listView.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.list_item_row, R.id.tv_list_item_row, index));
        return view;
    }
}
