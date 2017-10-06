package profbanku.profbanku.QuantitativeAptitudeActivities.Algebra;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import profbanku.profbanku.R;

public class VideoFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_video_algebra,container,false);
        String[] indexa = new String[4];
        for (int i = 0; i < indexa.length; i++){
            indexa[i] = "Video "+ (i+1);
        }
        ListView listView = (ListView) view.findViewById(R.id.list_view_qaa);
        listView.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.list_item_row, R.id.tv_list_item_row,indexa));
        return view;
    }
}
