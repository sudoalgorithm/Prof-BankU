package profbanku.profbanku.VerbalActivities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import profbanku.profbanku.R;

public class CaseOfPronoun extends AppCompatActivity {

    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private ImageView mImageView1, mImageView2, mImageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_of_pronoun);
        toolbar();
        mImageView1 = (ImageView) findViewById(R.id.image_View_cop1);
        mImageView2 = (ImageView) findViewById(R.id.image_View_cop2);
        mImageView3 = (ImageView) findViewById(R.id.image_View_cop3);
        Picasso.with(this).load(R.drawable.pageenglish8).into(mImageView1);
        Picasso.with(this).load(R.drawable.pageenglish9).into(mImageView2);
        Picasso.with(this).load(R.drawable.pageenglish10).into(mImageView3);

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
