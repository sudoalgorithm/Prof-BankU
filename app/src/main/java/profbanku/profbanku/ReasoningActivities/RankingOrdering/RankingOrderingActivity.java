package profbanku.profbanku.ReasoningActivities.RankingOrdering;

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
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

import profbanku.profbanku.Config;
import profbanku.profbanku.R;

import static profbanku.profbanku.R.id.youtubeFragmentRankingOrdering;

public class RankingOrderingActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_ranking_ordering);
        mLinearLayout = (LinearLayout) findViewById(R.id.activity_ranking_ordering);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        if (mActionBar != null){
            mActionBar.setDisplayHomeAsUpEnabled(true);
            mActionBar.setDisplayShowHomeEnabled(true);
            mActionBar.setDisplayShowTitleEnabled(false);
        }

        mYouTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager().findFragmentById(youtubeFragmentRankingOrdering);
        mYouTubePlayerFragment.initialize(Config.DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.cuePlaylist("PLBUmbdCAjoeoHDRJSg2_S4bJrj4tXJw6x");
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
        final RankingOrderingActivity.PagerAdapter adapter = new RankingOrderingActivity.PagerAdapter
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
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
                    FactsheetRankingOrderingFragment tab1 = new FactsheetRankingOrderingFragment();
                    return tab1;
                case 1:
                    QuestionsRankingOrderingFragment tab2 = new QuestionsRankingOrderingFragment();
                    return tab2;
                case 2:
                    VideoRankingOrderingFragment tab3 = new VideoRankingOrderingFragment();
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
