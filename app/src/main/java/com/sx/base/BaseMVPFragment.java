package com.sx.base;


public abstract class BaseMVPFragment<V, P extends BasePresenter<V>> extends BaseFragment {
    protected P mPresenter;

    @Override
    protected void initMVP() {
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attach((V) this);
        }
    }

    protected abstract P createPresenter();


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
