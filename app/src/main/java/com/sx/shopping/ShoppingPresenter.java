package com.sx.shopping;

import com.sx.base.BasePresenter;

public class ShoppingPresenter<V extends ShoppingCatract.showView> extends BasePresenter<V> implements ShoppingCatract.showPresenter, ShoppingCatract.showModel.Callback {
    private ShoppingCatract.showModel mModel = new ShoppingModel();

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
