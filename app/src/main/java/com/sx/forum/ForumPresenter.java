package com.sx.forum;

import com.sx.base.BasePresenter;

public class ForumPresenter <V extends  ForumCatract.showView>  extends BasePresenter<V> implements ForumCatract.showPresenter,ForumCatract.showModel.Callback {
    private    ForumCatract.showModel mModel=new ForumModel();
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
