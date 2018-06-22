package edu.uc.meyer3js.venuelocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

abstract class VenueLocatorBaseActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        int currentMenuId = getCurrentMenuId();
        if (currentMenuId != 0) {
            menu.removeItem(currentMenuId);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Abstract method to be implemented in child activity classes to remove the
     * current activity item from the menu
     * @return the menuID
     */
    protected abstract int getCurrentMenuId();

    /**
     * Invoked when user clicks the searchVenue menu item
     * @param item The menuItem object clicked
     */
    public void searchVenueClicked(MenuItem item) {
        Intent searchVenueIntent = new Intent(this, SearchVenue.class);
        startActivity(searchVenueIntent);
    }

    /**
     * Invoked when user clicks the searchVenue menu item
     * @param item The menuItem object clicked
     */
    public void settingsClicked(MenuItem item) {
        Intent searchVenueIntent = new Intent(this, Settings.class);
        startActivity(searchVenueIntent);
    }
}
