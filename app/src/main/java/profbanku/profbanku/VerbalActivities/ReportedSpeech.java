package profbanku.profbanku.VerbalActivities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import profbanku.profbanku.R;

public class ReportedSpeech extends AppCompatActivity {

    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private ImageView mImageView1, mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reported_speech);
        toolbar();
        mImageView1 = (ImageView) findViewById(R.id.image_view_reported_speech1);
        mImageView2 = (ImageView) findViewById(R.id.image_view_reported_speech2);
        Picasso.with(this).load(R.drawable.englishpage14).into(mImageView1);
        Picasso.with(this).load(R.drawable.englishpage15).into(mImageView2);
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
