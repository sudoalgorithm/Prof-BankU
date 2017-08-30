package profbanku.profbanku.GKActivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import profbanku.profbanku.R;

public class BioActivity extends AppCompatActivity {

    private List<GkRowModel> mDataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mDataSet = fill_with_data();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_bio);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RVGKAdapter adapter = new RVGKAdapter(mDataSet, getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    public List<GkRowModel> fill_with_data() {

        List<GkRowModel> data = new ArrayList<>();

        data.add(new GkRowModel( R.drawable.page0gk));
        data.add(new GkRowModel( R.drawable.page1gk));
        data.add(new GkRowModel( R.drawable.page2gk));
        data.add(new GkRowModel( R.drawable.page3gk));
        data.add(new GkRowModel( R.drawable.page4gk));
        data.add(new GkRowModel( R.drawable.page5gk));
        data.add(new GkRowModel( R.drawable.page6gk));
        data.add(new GkRowModel( R.drawable.page7gk));
        return data;
    }


}
