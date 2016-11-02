package se.sugarest.jane.budapest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by jane on 16-10-30.
 */

public class BudapestFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new BudapestFragmentPagerAdapter object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter across swipes.
     */
    public BudapestFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    /**
     * @param position
     * @return the Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EatFragment();
        } else if (position == 1) {
            return new SeeFragment();
        } else if (position == 2) {
            return new ShopFragment();
        } else
            return new PlayFragment();
    }

    /**
     * @return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_eat);
        } else if (position == 1) {
            return mContext.getString(R.string.category_see);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shop);
        } else {
            return mContext.getString(R.string.category_play);
        }
    }
}
