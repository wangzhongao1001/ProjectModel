package com.sx.base;

public abstract class BaseMVPActivity<V, P extends BasePresenter<V>> extends BaseActivity {

    protected P mPresenter;


    @Override
    protected void initMVP() {
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attach((V) this);
        }
    }

    protected abstract P createPresenter();


}
