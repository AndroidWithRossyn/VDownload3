package com.videosdownide.loadbase.vdownload.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.videosdownide.loadbase.vdownload.Fragment.LiveWallpaperFragment;
import com.videosdownide.loadbase.vdownload.Fragment.SimpleWallpeperFragment;

public class MyFragmentAdapter extends FragmentStateAdapter {


    public MyFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new SimpleWallpeperFragment();
        } else {
            return new LiveWallpaperFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
