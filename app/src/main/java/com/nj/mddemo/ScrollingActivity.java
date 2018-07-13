package com.nj.mddemo;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class ScrollingActivity extends AppCompatActivity {
    private static final String TAG = "ScrollingActivityLOG";

    private LinearLayout mToolbarClose;
    private LinearLayout mToolbarOpen;
    private AppBarLayout mAppbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mToolbarOpen = findViewById(R.id.toolbar_layout_open);
        mToolbarClose = findViewById(R.id.toolbar_layout_close);

        mToolbarOpen.setVisibility(View.VISIBLE);
        mToolbarClose.setVisibility(View.GONE);
        mAppbar = findViewById(R.id.app_bar);

        mAppbar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.d(TAG, "mAppbar.getTotalScrollRange(): " + mAppbar.getTotalScrollRange());
                Log.d(TAG, "onOffsetChanged: " + verticalOffset);
            }
        });
    }

}
