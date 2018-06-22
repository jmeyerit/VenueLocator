package edu.uc.meyer3js.venuelocator;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.ButterKnife;

public class SearchVenue extends VenueLocatorBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_venue);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

    }

    @Override
    protected int getCurrentMenuId() {
        return R.id.searchVenue;
    }
}
