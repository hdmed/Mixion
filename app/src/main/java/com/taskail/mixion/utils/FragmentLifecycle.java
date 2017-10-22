package com.taskail.mixion.utils;

/**Created by ed on 10/3/17.
 *
 * This interface implements a manual lifecycle for each fragment
 */
public interface FragmentLifecycle {

    void onPauseFragment();
    void onResumeFragment();
}
