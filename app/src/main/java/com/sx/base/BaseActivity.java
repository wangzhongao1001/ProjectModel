package com.sx.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getlayoutID());
        ButterKnife.bind(this);
        initMVP();
        initViewAndData();
        initData();

    }

    protected abstract int getlayoutID();

    protected void initMVP() {
    }

    protected void initData() {
    }


    protected void initViewAndData() {

    }
}
