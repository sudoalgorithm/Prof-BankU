package profbanku.profbanku.VerbalActivities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import profbanku.profbanku.R;

public class Voice extends AppCompatActivity {

    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private ImageView mImageView1, mImageView2, mImageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);
        toolbar();
        mImageView1 = (ImageView) findViewById(R.id.image_View_voice1);
        mImageView2 = (ImageView) findViewById(R.id.image_View_voice2);
        mImageView3 = (ImageView) findViewById(R.id.image_View_voice3);
        Picasso.with(this).load(R.drawable.englishvoice1).into(mImageView1);
        Picasso.with(this).load(R.drawable.englishvoice2).into(mImageView2);
        Picasso.with(this).load(R.drawable.englishvoice3).into(mImageView3);
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
