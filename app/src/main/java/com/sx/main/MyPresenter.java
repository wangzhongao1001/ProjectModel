package com.sx.main;

import com.sx.base.BasePresenter;

public class MyPresenter<V extends MyCatract.showView> extends BasePresenter<V> implements MyCatract.showPresenter, MyCatract.showModel.Callback {
    private MyCatract.showModel mModel = new MyModel();

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
