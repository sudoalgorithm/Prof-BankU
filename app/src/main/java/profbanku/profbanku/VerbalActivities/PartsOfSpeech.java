package profbanku.profbanku.VerbalActivities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import profbanku.profbanku.R;

public class PartsOfSpeech extends AppCompatActivity {

    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private ImageView mImageView1, mImageView2, mImageView3, mImageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_of_speech);
        toolbar();
        mImageView1 = (ImageView) findViewById(R.id.parts_of_speech1);
        mImageView2 = (ImageView) findViewById(R.id.parts_of_speech2);
        mImageView3 = (ImageView) findViewById(R.id.parts_of_speech3);
        mImageView4 = (ImageView) findViewById(R.id.parts_of_speech4);
        Picasso.with(this).load(R.drawable.pageenglish4).into(mImageView1);
        Picasso.with(this).load(R.drawable.pageenglish5).into(mImageView2);
        Picasso.with(this).load(R.drawable.pageenglish6).into(mImageView3);
        Picasso.with(this).load(R.drawable.pageenglish7).into(mImageView4);
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
