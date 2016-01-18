package ca.sapphire.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by apreston on 1/17/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
