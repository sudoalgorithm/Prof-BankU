package profbanku.profbanku.VerbalActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import profbanku.profbanku.R;

public class VerbalActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private ListView mListView;
    private String[] mDataSet= {"Parts Of Speech","Reported Speech","Active-Passive Voice","Subject-Verb-Agreement","Tenses","Clauses","Case Of Pronoun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal);
        toolbar();

        mListView = (ListView) findViewById(R.id.list_view_verbal);
        mListView.setAdapter(new ArrayAdapter<>(this, R.layout.list_item_row, R.id.tv_list_item_row,mDataSet));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(VerbalActivity.this,PartsOfSpeech.class));
                        break;
                    case 1:
                        startActivity(new Intent(VerbalActivity.this,ReportedSpeech.class));
                        break;
                    case 2:
                        startActivity(new Intent(VerbalActivity.this,Voice.class));
                        break;
                    case 3:
                        startActivity(new Intent(VerbalActivity.this,SubjectVerbAgreement.class));
                        break;
                    case 4:
                        startActivity(new Intent(VerbalActivity.this,TenseActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(VerbalActivity.this,Clauses.class));
                        break;
                    case 6:
                        startActivity(new Intent(VerbalActivity.this,CaseOfPronoun.class));
                        break;
                }
            }
        });


    }

    private void toolbar(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        if (mActionBar != null){
            mActionBar.setDisplayHomeAsUpEnabled(true);
            mActionBar.setDisplayShowHomeEnabled(true);
            mActionBar.setDisplayShowTitleEnabled(false);
        }


    }
}
