package com.sx.course;

import com.sx.base.BasePresenter;

public class CoursePresenter<V extends CourseCatract.showView> extends BasePresenter<V> implements CourseCatract.showPresenter, CourseCatract.showModel.Callback {
    private CourseCatract.showModel mModel = new CourseModel();

    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void http() {
        if (mView != null) {
            mModel.data(this);
        }
    }
}
