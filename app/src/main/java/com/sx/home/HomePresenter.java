package com.sx.home;

import com.sx.base.BasePresenter;

public class HomePresenter<V extends HomeCatract.showView>  extends BasePresenter<V> implements  HomeCatract.showPresenter,HomeCatract.showModel.Callback {
    private   HomeCatract.showModel mModel=new HomeModel();
    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void http() {
        if (mView!=null){
            mModel.data(this);

        }

    }
}
