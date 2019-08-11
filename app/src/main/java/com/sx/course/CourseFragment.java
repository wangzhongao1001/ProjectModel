package com.sx.course;


import android.support.v4.app.Fragment;
import android.view.View;

import com.example.projectmodel.R;
import com.sx.base.BaseMVPFragment;
import com.sx.base.BasePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CourseFragment extends BaseMVPFragment<CourseCatract.showView, BasePresenter<CourseCatract.showView>>implements  CourseCatract.showView {


    @Override
    protected BasePresenter<CourseCatract.showView> createPresenter() {
        return new CoursePresenter<>();
    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_course;
    }

    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }
}
