package com.da08.navibar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Da08 on 2017. 8. 21..
 */

public class FirstLayout extends Fragment {

    View v;   // 뷰 객체 생섯

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.first_layout, container, false);
        return v;
    }
}
