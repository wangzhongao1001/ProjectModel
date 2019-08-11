package com.sx.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View inflate = inflater.inflate(getLayout(), container, false);
        initView(inflate);
        initMVP();
        initData();

        return inflate;
    }

    protected void initMVP() {

    }


    protected void initData() {
    }

    protected abstract void initView(View inflate);

    protected abstract int getLayout();



}
