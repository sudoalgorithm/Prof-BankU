package profbanku.profbanku.QuantitativeAptitudeActivities.SpeedDistanceTime;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

import profbanku.profbanku.Config;
import profbanku.profbanku.R;

import static profbanku.profbanku.R.id.youtubeFragmentSpeedDistanceTime;

public class SpeedDistanceTimeActivity extends AppCompatActivity {

    private static final int RECOVERY_REQUEST = 1;
    private LinearLayout mLinearLayout;
    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private YouTubePlayerFragment mYouTubePlayerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_distance_time_activiy);
        mLinearLayout = (LinearLayout) findViewById(R.id.activity_speed_distance_time_activiy);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        if (mActionBar != null){
            mActionBar.setDisplayHomeAsUpEnabled(true);
            mActionBar.setDisplayShowHomeEnabled(true);
            mActionBar.setDisplayShowTitleEnabled(false);
        }

        mYouTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager().findFragmentById(youtubeFragmentSpeedDistanceTime);
        mYouTubePlayerFragment.initialize(Config.DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.cuePlaylist("PLBUmbdCAjoer3-sp82dA3rQU4piTnG9lE");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                if (youTubeInitializationResult.isUserRecoverableError()){
                    youTubeInitializationResult.getErrorDialog((Activity) getApplicationContext(), RECOVERY_REQUEST).show();
                }else {
                    String error = String.format("Error initializing youtube player", youTubeInitializationResult.toString());
                    Snackbar.make(mLinearLayout, error, Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mTabLayout.addTab(mTabLayout.newTab().setText("FACTSHEET"));
        mTabLayout.addTab(mTabLayout.newTab().setText("VIDEOS"));
        mTabLayout.addTab(mTabLayout.newTab().setText("QUESTIONS"));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        final SpeedDistanceTimeActivity.PagerAdapter adapter = new SpeedDistanceTimeActivity.PagerAdapter
                (getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    public class PagerAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    FactsheetSpeedDistanceTimeFragment tab1 = new FactsheetSpeedDistanceTimeFragment();
                    return tab1;
                case 1:
                    QuestionsSpeedDistanceTimeFragment tab2 = new QuestionsSpeedDistanceTimeFragment();
                    return tab2;
                case 2:
                    VideosSpeedDistanceTimeFragment tab3 = new VideosSpeedDistanceTimeFragment();
                    return tab3;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }
}
