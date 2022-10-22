package com.swalloow.myeventbus.bus;

import android.app.Fragment;

/**
 * Created by Junyoung on 2016-07-08.
 */

public class MoveToFragmentEvent {
    /**
     * {@link android.app.Fragment} to switch.
     */
    private Fragment mFragment;

    /**
     * Constructor of {@link MoveToFragmentEvent}
     *
     * @param _fragment
     * 		{@link android.app.Fragment} to switch.
     */
    public MoveToFragmentEvent(Fragment _fragment) {
        mFragment = _fragment;
    }

    /**
     * Get the {@link android.app.Fragment} to switch.
     *
     * @return {@link android.app.Fragment} to switch.
     */
    public Fragment getFragment() {
        return mFragment;
    }
}
