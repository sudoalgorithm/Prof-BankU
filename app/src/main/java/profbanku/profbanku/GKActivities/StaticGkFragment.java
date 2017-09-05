package profbanku.profbanku.GKActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import profbanku.profbanku.R;

public class StaticGkFragment extends android.support.v4.app.Fragment {

    private String mDataSet[] = {"Biology","Physics","Chemistry","Country-Currency-Capital","Dams","Classical dances","International Organisations","Stock Indices","Constitution of India"};

    public StaticGkFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_static_gk_fragment,container, false);
        ListView listView = (ListView) view.findViewById(R.id.list_view_static_gk);
        listView.setAdapter(new ArrayAdapter<>(getContext(), R.layout.list_item_row, R.id.tv_list_item_row,mDataSet));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(getContext(), BioActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getContext(), PhysicsActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getContext(), ChemistryActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getContext(), CCC.class));
                        break;
                    case 4:
                        startActivity(new Intent(getContext(), Dams.class));
                        break;
                    case 5:
                        startActivity(new Intent(getContext(), ClassicalDances.class));
                        break;
                    case 6:
                        startActivity(new Intent(getContext(), InternationalOrganisations.class));
                        break;
                    case 7:
                        startActivity(new Intent(getContext(), StockIndices.class));
                        break;
                    case 8:


                }
            }
        });
        return view;
    }
}
