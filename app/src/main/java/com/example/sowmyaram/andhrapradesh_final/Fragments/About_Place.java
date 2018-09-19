package com.example.sowmyaram.andhrapradesh_final.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sowmyaram.andhrapradesh_final.R;
import com.example.sowmyaram.andhrapradesh_final.adapter.MyCustomPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class About_Place extends Fragment {
    ViewPager viewPager;
    int images[] = {R.drawable.tirupat,R.drawable.belum_cave_720,R.drawable.ramakrishnabeach,R.drawable.nagarjunasagar};
    MyCustomPagerAdapter myCustomPagerAdapter;
    public int currentimageindex = 0;
    //    Timer timer;
//    TimerTask task;
    ImageView slidingimage;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us_scren,
                container, false);
        slidingimage = (ImageView) view.findViewById(R.id.ImageView3_Left);
        final Handler mHandler = new Handler();
        final Runnable mUpdateResults = new Runnable() {
            public void run() {

                AnimateandSlideShow();

            }
        };

        int delay = 10; // delay for 1 sec.

        int period = 4000; // repeat every 4 sec.

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                mHandler.post(mUpdateResults);

            }

        }, delay, period);


        return view;
    }
        private void AnimateandSlideShow() {
        slidingimage.setImageResource(images[currentimageindex%images.length]);
        currentimageindex++;
    }


}

