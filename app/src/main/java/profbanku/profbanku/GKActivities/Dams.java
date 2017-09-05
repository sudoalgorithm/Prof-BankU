package profbanku.profbanku.GKActivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import profbanku.profbanku.R;

public class Dams extends AppCompatActivity {

    private List<GkRowModel> mDataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dams);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mDataSet = fill_with_data();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_dams);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RVGKAdapter adapter = new RVGKAdapter(mDataSet, getApplicationContext());
        recyclerView.setAdapter(adapter);


    }

    public List<GkRowModel> fill_with_data() {

        List<GkRowModel> data = new ArrayList<>();

        data.add(new GkRowModel( R.drawable.page0dams));
        return data;
    }
}
